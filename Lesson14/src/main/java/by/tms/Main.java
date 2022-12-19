package by.tms;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        /**
         * 1) Даны строки разной длины c четным числом символов(казаки, просмотреть и так далее),
         * необходимо вернуть ее два средних знака.
         * Например, если дана строка "string"  результат будет "ri", для строки "code" результат "od",  для "Practice" результат "ct".
         */

        {
            System.out.println(Arrays.toString(getMiddleSigns("казаки", "метасимвол", "звезда", "строка")));
        }

        /**
         * 2) Дана строка "cab, ccab, cccab" Необходимо составить регулярное выражение, сделать класс Pattern, Matcher, вызвать метод find и вывести слова на консоль
         * Должно вывести:
         * cab
         * ccab
         * cccab
         */

        {
            System.out.println("--------------------------------------");
            Pattern pattern = Pattern.compile("c+ab");
            print(getSubstrings("cab, ccab, cccab", pattern));
        }

        /**
         * 3) Дана строка "Versions: Java  5, Java 6, Java   7, Java 8, Java 12."  Найти все подстроки "Java X", где X - число и распечатать их.
         */

        {
            System.out.println("--------------------------------------");
            Pattern pattern = Pattern.compile("Java\\s+[0-9]+");
            print(getSubstrings("Versions: Java  5, Java 6, Java   7, Java 8, Java 12.", pattern));
        }

        /**
         * 4*)со звездочкой! Предложение состоит из нескольких слов, разделенных пробелами. Например: "One two three раз два три one1 two2 123 ".
         * Найти количество слов, содержащих только символы латинского алфавита.
         * Необходимо составить регулярное выражение и вызвать его в методе split(Regexp)
         * String str = "One two three раз два три one1 two2 123 ";
         * System.out.println(str.split("регулярное выражение").length);
         * Подсказка: тут надо использовать:
         * 1) группы ()
         * 2) | - оператор или
         * [] - группировки символов
         * 4) +,* - квантификаторы
         *
         * PS: Кто не сможет осилить регулярное выражение, то сделайте как сможете!
         */

        {
            System.out.println("--------------------------------------");
            String str = "One two three раз два три one1 two2 123 ";
            System.out.println(str.split("\\s+|([а-яА-Я]+)|([a-zA-Z]+?\\d+)|(\\d+)").length);
        }

        /**
         * *5*)со звездочкой! В метод на вход приходит строка
         * public static boolean validate(String str) {
         *      return false;
         * }
         * Необходимо выполнить проверку на валидацию входящей строки и вернуть false или true
         * - Строка должна содержать только маленькие латинские буквы и цифры 1 или 5 без знака подчеркивания.
         * - Длина строки должна быть от 4 до 20 символов.
         * PS: нужно посмотреть презентацию страница 44 (Метасимволы для группировки символов)
         */

        {
            System.out.println("--------------------------------------");
            String str = "q1555";
            System.out.println(validate(str));
        }
    }

    public static String[] getMiddleSigns(String... str) {
        String[] result = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            result[i] = str[i].substring(str[i].length() / 2 - 1, str[i].length() / 2 + 1);
        }
        return result;
    }

    public static String[] getSubstrings(String string, Pattern pattern) {
        String[] words = string.split(",");
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            Matcher matcher = pattern.matcher(words[i]);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                result[i] = words[i].substring(start, end);
            }
        }
        return result;
    }

    public static void print(String[] strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static boolean validate(String str) {
        return str.matches("[a-z15]{4,20}");
    }
}
