import java.util.Arrays;
import java.util.Scanner;

public class MainTasks {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeElementFromArray(new int[]{9, 4, 6, 9, 3, 9, 6, 5, 9})));
        System.out.println(getMinValue(createRandomArray()));
        System.out.println(getMaxValue(createRandomArray()));
        System.out.println(getAverageValue(createRandomArray()));
        findMaxAverageValue();
    }

    /**
     * 1) Создайте массив целых чисел. Напишете программу, которая выводит
     * сообщение о том, входит ли заданное число в массив или нет.
     * Пусть число для поиска задается с консоли (класс Scanner).
     */

    public static void checkNumberInArray(int[] array) {
        int number = enterNumber();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("svfkj");
        } else {
            System.out.println("sdvnnvj");
        }

    }

    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = 0;
        do {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
            } else {
                System.out.println("Mistake!");
                scanner.next();
            }
        } while (number <= 0);
        return number;
    }

    /**
     * 2) Создайте массив целых чисел. Удалите все вхождения заданного
     * числа из массива. Пусть число задается с консоли (класс Scanner). Если такого числа нет -
     * выведите сообщения об этом. В результате должен быть новый массив без указанного числа.
     */

    public static int[] removeElementFromArray(int[] array) {
        System.out.println("Please, enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] preResult = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            } else {
                preResult[i - count] = array[i];
            }
        }
        return Arrays.copyOf(preResult, preResult.length - count);
    }

    /**
     * 3) Создайте и заполните массив случайным числами и выведете
     * максимальное, минимальное и среднее значение.
     * Для генерации случайного числа используйте метод Math.random().
     * Пусть будет возможность создавать массив произвольного размера.
     * Пусть размер массива вводится с консоли.
     */

    public static int[] createRandomArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a length of array");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int getMinValue(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static int getMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static int getAverageValue(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    /**
     * 4) Создайте 2 массива из 5 чисел.
     * Выведите массивы на консоль в двух отдельных строках.
     * Посчитайте среднее арифметическое элементов каждого массива и
     * сообщите, для какого из массивов это значение оказалось больше (либо
     * сообщите, что их средние арифметические равны).
     */

    public static void findMaxAverageValue() {
        int[] firstArray = {2, 4, 6, 8, 9};
        int[] secondArray = {3, 5, 9, 7, 1};
        System.out.println(Arrays.toString(firstArray) + " The average value = " + getDoubleAverageValue(firstArray));
        System.out.println(Arrays.toString(secondArray) + " The average value = " + getDoubleAverageValue(secondArray));
        if (getDoubleAverageValue(firstArray) > getDoubleAverageValue(secondArray)) {
            System.out.println("The average value of firstArray is largest");
        } else if (getDoubleAverageValue(firstArray) < getDoubleAverageValue(secondArray)) {
            System.out.println("The average value of secondArray is largest");
        } else {
            System.out.println("Average values of firstArray and secondArray are equal");
        }
    }

    public static double getDoubleAverageValue(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }
}
