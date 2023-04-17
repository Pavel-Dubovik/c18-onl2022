package by.teachmeskills.eshop.utils;

import by.teachmeskills.eshop.controllers.BaseCommandController;
import by.teachmeskills.eshop.controllers.CartControllerDoGet;
import by.teachmeskills.eshop.controllers.CartControllerDoPost;
import by.teachmeskills.eshop.controllers.CategoryController;
import by.teachmeskills.eshop.controllers.HomeController;
import by.teachmeskills.eshop.controllers.ProductController;
import by.teachmeskills.eshop.model.Command;
import lombok.experimental.UtilityClass;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

import static by.teachmeskills.eshop.utils.InjectObjectFactory.createAndInjectInstanses;

@UtilityClass
public class CommandControllerFactory {

    public static final Map<String, BaseCommandController> COMMANDS = new ConcurrentHashMap<>();

    public static BaseCommandController defineCommand(Command command) throws Exception {
        return putIfAbsent(command.getCommand(), createController(command));
    }

    private static Supplier<BaseCommandController> createController(Command command) {
        return switch (command) {
            case HOME_COMMAND -> HomeController::new;
            case CATEGORY_COMMAND -> CategoryController::new;
            case PRODUCT_COMMAND -> ProductController::new;
            case CART_COMMAND_GET -> CartControllerDoGet::new;
            case CART_COMMAND_POST -> CartControllerDoPost::new;
        };
    }

    private static BaseCommandController putIfAbsent(String key, Supplier<BaseCommandController> supplier) throws Exception {
        BaseCommandController value = COMMANDS.get(key);
        if (value == null) {
            value = create(supplier);
            COMMANDS.put(key, value);
        }
        return value;
    }

    private static BaseCommandController create(Supplier<BaseCommandController> supplier) throws Exception {
        BaseCommandController baseCommandController = supplier.get();
        createAndInjectInstanses(baseCommandController);
        return baseCommandController;
    }
}