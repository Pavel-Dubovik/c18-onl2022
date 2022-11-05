import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork4Additional {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printArray()));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6, 9, 1, 3, 5}));
        foobar(6);
        foobar(10);
        foobar(15);
        countDevs(101);
        countDevs(102);
        countDevs(53);
        countDevs(344);
        countDevs(55);
        countDevs(976);
        countDevs(68);
        countDevs(679);
        countDevs(410);
        printPrimeNumbers();

    }

    public static int[] printArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int number = scanner.nextInt();
        while (number < 0) {
            System.out.println("Mistake! Enter a positive number:");
            number = scanner.nextInt();
        }

        int[] array = new int[number];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        return array;
    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        if (number > 0) {
            number++;
        } else if (number < 0) {
            number -= 2;
        } else {
            number = 10;
        }
        return number;
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int quantityNotEven = 0;
        for (int anInt : ints) {
            if (anInt % 2 != 0) {
                quantityNotEven++;
            }
        }
        return quantityNotEven;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        if (count % 10 == 0 || count % 10 == 5 || count % 10 == 6 || count % 10 == 7 || count % 10 == 8 || count % 10 == 9) {
            System.out.println(count + " программистов");
        } else if (count % 10 == 2 || count % 10 == 3 || count % 10 == 4) {
            System.out.println(count + " программиста");
        } else if (count % 10 == 1) {
            System.out.println(count + " программист");
        }

    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("foobar");
        } else if (number % 5 == 0) {
            System.out.println("bar");
        } else if (number % 3 == 0) {
            System.out.println("foo");
        }
    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (<a href="https://www.webmath.ru/poleznoe/formules_18_5.php">...</a>)
     */
    public static void printPrimeNumbers() {
        for (int number = 2; number < 1000; number++) {
            int numberOfDivisors = 0;
            for (int divisor = 2; divisor <= number; divisor++) {
                if (number % divisor == 0) {
                    numberOfDivisors++;
                }
            }
            if (numberOfDivisors == 1) {
                System.out.println(number);
            }
        }
    }
}
