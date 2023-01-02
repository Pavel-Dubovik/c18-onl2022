package by.tms.task4;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Calculator {
    public static <T extends Number, K extends Number> double sum(T t, K k) {
        return t.doubleValue() + k.doubleValue();
    }

    public static <T extends Number, K extends Number> double multiply(T t, K k) {
        return t.doubleValue() * k.doubleValue();
    }

    public static <T extends Number, K extends Number> double divide(T t, K k) {
        return t.doubleValue() / k.doubleValue();
    }

    public static <T extends Number, K extends Number> double subtraction(T t, K k) {
        return t.doubleValue() - k.doubleValue();
    }
}
