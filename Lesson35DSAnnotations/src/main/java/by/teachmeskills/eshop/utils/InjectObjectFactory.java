package by.teachmeskills.eshop.utils;

import by.teachmeskills.eshop.model.Inject;
import by.teachmeskills.eshop.repository.CategoryRepository;
import by.teachmeskills.eshop.repository.ProductRepository;
import by.teachmeskills.eshop.repository.impl.JdbcCategoryRepositoryImpl;
import by.teachmeskills.eshop.repository.impl.StaticProductRepositoryImpl;
import by.teachmeskills.eshop.service.CategoryService;
import by.teachmeskills.eshop.service.ProductService;
import by.teachmeskills.eshop.service.impl.CategoryServiceImpl;
import by.teachmeskills.eshop.service.impl.ProductServiceImpl;
import lombok.experimental.UtilityClass;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@UtilityClass
public class InjectObjectFactory {

    public static final Map<Class<?>, Object> CLASS_OBJECT_MAP = new ConcurrentHashMap<>();

    public static void createAndInjectInstanses(Object object) throws Exception {
        for (Field declaredField : object.getClass().getDeclaredFields()) {
            Inject injectField = declaredField.getAnnotation(Inject.class);
            if (injectField != null) {
                Object service = putInstanceToMapIfAbsent(declaredField.getType());
                Method injectMethod = getInjectMethod(object, declaredField.getType());
                injectMethod.invoke(object, service);
                createAndInjectInstanses(service);
            }
        }
    }

    private static <T> Object putInstanceToMapIfAbsent(Class<T> serviceType) {
        Object value = CLASS_OBJECT_MAP.get(serviceType);
        if (value == null) {
            value = createInstance(serviceType);
            CLASS_OBJECT_MAP.put(serviceType, value);
        }
        return value;
    }

    private static <T> Object createInstance(Class<T> serviceType) {
        if (CategoryService.class == serviceType) {
            return new CategoryServiceImpl();
        } else if (CategoryRepository.class == serviceType) {
            return new JdbcCategoryRepositoryImpl();
        } else if (ProductService.class == serviceType) {
            return new ProductServiceImpl();
        } else if (ProductRepository.class == serviceType) {
            return new StaticProductRepositoryImpl();
        }
        throw new IllegalArgumentException("Can't create instance of class " + serviceType);
    }

    private static Method getInjectMethod(Object object, Class<?> type) {
        for (Method declaredMethod : object.getClass().getDeclaredMethods()) {
            boolean allMatch = Arrays.stream(declaredMethod.getParameterTypes())
                    .allMatch(typeOfMethodParameter -> typeOfMethodParameter == type
                            && declaredMethod.getReturnType() == Void.TYPE
                            && declaredMethod.getName().startsWith("set"));
            if (allMatch) {
                return declaredMethod;
            }
        }
        throw new IllegalArgumentException("Can't find method with parameter " + type);
    }
}