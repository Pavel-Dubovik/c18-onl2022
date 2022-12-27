package by.tms;

import by.tms.service.TextFormatter;
import by.tms.task2practice.Employee;

public class Main {
    public static void main(String[] args) {
        /**
         * 1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения сивола(B).
         * 2) Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0
         * 3) В массиве находятся слова. Вывести на экран слова палиндромы
         * (т.е которые читаются справа на лево и слева на право одинаково, например: заказ, казак, дед...)
         * 4) Есть строка в которой содержится текст, предложения разделены точками.
         * После запуска программы на экран должны выводиться только те предложения в которых от 3-х до 5-ти слов.
         * Если в предложении присутствует слово-палиндром, то не имеет значения какое количество слов в предложении, оно выводится на экран.
         * Пишем все в ООП стиле.
         * 1. Метод принимает строку и возвращает кол-во слов в строке.
         * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
         * В main создаем строку с текстом, также можно текст задавать с консоли.
         * Разбиваем текст на предложения. Используя методы класса TextFormatter определяем подходит ли нам предложение.
         * Если подходит, то выводим на экран.
         * 5)Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака:
         * Пример: "string" → "ri", "code" → "od", "Practice"→"ct".
         * 6)Создать класс Employee, у которого есть переменные класса - String fullname, double salary.
         * Создать массив содержащий несколько объектов этого типа. Создать класс Report (по возможности интерфейс),
         * который будет содержать метод generateReport, в котором выводится информация о зарплате всех сотрудников.
         * Используйте форматировании строк(https://javarush.ru/quests/lectures/questmultithreading.level02.lecture06)
         * Пусть salary будет выровнено по правому краю, десятичное значение имеет 2 знака после запятой и по одной первой букве имени и отчества через точки.
         * Пример: | Л.Н. Толстой		|		200.34|
         * 7*(Можно не делать!))Найти количество слов, содержащих только символы латинского алфавита. Пример:
         * "Методы доступа называют ещё аксессорами (от англ. access — доступ), или по отдельности — геттерами (англ. get — чтение) and сеттерами (англ. set — запись)"
         */

        {
            String str = "1) Вырезать подстроку из строки начиная с первого вхождения символа(A) до, последнего вхождения сивола(B).";
            System.out.println(str.substring(str.indexOf('A'), str.lastIndexOf('B')));
        }
        {
            String str = "Develop";
            System.out.println(str.replace(str.charAt(3), str.charAt(0)));
        }
        {
            String[] str = {"Заказ", "карман", "бабушка", "шалаш", "кабак"};
            for (String s : str) {
                String sLowerCase = s.toLowerCase();
                StringBuilder stringBuilder = new StringBuilder(sLowerCase);
                StringBuilder reverse = stringBuilder.reverse();
                if ((reverse.toString()).equals(sLowerCase)) {
                    System.out.println(s);
                }
            }
        }

        TextFormatter formatter = new TextFormatter();
        String text = "Как хорошо летом на море. Холодно. Хомяки спали весь день. В Москве случился потоп.";
        String[] sentences = text.split("\\.");
        for (String sentence : sentences) {
            int quantity = (formatter.getNumberOfWords(sentence));
            if (quantity >= 3 && quantity <= 5 || formatter.isPalindromeInString(sentence.split(" "))) {
                System.out.println(sentence.trim());
            }
        }

        System.out.println(formatter.getMiddleSigns("Examples"));

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Е.М. Секретарева", 673.4);
        employees[1] = new Employee("Ю.М. Марковский", 738.4);
        employees[2] = new Employee("Г.А. Бояренко", 370.5);
        employees[3] = new Employee("И.И. Ситько", 1500);
        employees[4] = new Employee("Д.В. Севрук", 753.6);
        for (Employee employee : employees) {
            System.out.println(employee.generateReport());
        }
    }
}
