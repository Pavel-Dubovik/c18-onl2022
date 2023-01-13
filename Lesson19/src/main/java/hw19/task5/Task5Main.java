package hw19.task5;

import java.util.*;
import java.util.stream.Collectors;

public class Task5Main {
    /**
     * 5) Задан список сотрудников, которые хранятся в коллекции List<p3.Person>.
     * Объект p3.Person содержит имя и фамилию(по желанию другие данные)
     * a) написать метод, который отображает все фамилии, начинающиеся на букву "Д".
     * Внимание! метод должен вернуть объект Optional<String>.
     * b*)Со звездочкой. Написать метод, который будет выводить в столбик первую букву фамилии и рядом количество сотрудников,
     * у которых фамилия начинается с этой буквы.
     * Пример: Антонов, Петров, Сидоров, Александров...
     * на экран выведет:
     * A - 2 сотрудника
     * П - 1 сотрудник
     * С - 1 сотрудник
     */

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Константин", "Кустинский"));
        employees.add(new Employee("Юрий", "Марковский"));
        employees.add(new Employee("Илья", "Бречко"));
        employees.add(new Employee("Андрей", "Ковалевич"));
        employees.add(new Employee("Дмитрий", "Севрук"));

        System.out.println(getSortedSurname(employees));

        getNumberOfEmployeesByFirstLetter(employees).forEach(System.out::println);
    }

    public static Optional<String> getSortedSurname(List<Employee> employees) {
        return employees.stream()
                .map(Employee::getSecondName)
                .filter(surname -> surname.startsWith("Б"))
                .reduce((left, right) -> left + " " + right);
    }

    public static Set<Map.Entry<Character, Long>> getNumberOfEmployeesByFirstLetter(List<Employee> employees) {
        Map<Character, Long> resultList = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getSecondName().charAt(0), Collectors.counting()));
        return resultList.entrySet();
    }
}
