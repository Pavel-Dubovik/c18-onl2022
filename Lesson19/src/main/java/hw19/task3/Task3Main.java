package hw19.task3;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

public class Task3Main {
    /**
     * 3) Вывести список имен, но с первой заглавной буквой. Список имен: "john", "arya", "sansa".
     */
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("john", "arya", "sansa");
        strings.stream()
                .map(StringUtils::capitalize)
                .forEach(System.out::println);
    }
}
