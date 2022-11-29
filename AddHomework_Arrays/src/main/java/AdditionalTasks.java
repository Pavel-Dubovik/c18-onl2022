import java.util.Arrays;
import java.util.Scanner;

public class AdditionalTasks {
    public static void main(String[] args) {
        createArray();
        deleteEvenElementFromArray();
        System.out.println(Arrays.toString(sortStringArray(new String[]{"Tom", "Mark", "Robert", "Jim"})));
        System.out.println(Arrays.toString(bubbleSorting(new int[]{6, 1, 4, 9, 54, 7, 2})));
    }

    /**
     * 1) Создайте массив из n случайных целых чисел и выведите его на экран.
     * Размер массива пусть задается с консоли и размер массива может быть
     * больше 5 и меньше или равно 10.
     * Если n не удовлетворяет условию - выведите сообщение об этом.
     * Если пользователь ввёл не подходящее число, то программа должна
     * просить пользователя повторить ввод.
     * Создайте второй массив только из чётных элементов первого массива,
     * если они там есть, и вывести его на экран.
     */

    public static void createArray() {
        int[] firstArray = new int[enterNumber()];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(getEvenElementFromArray(firstArray)));
    }

    public static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Enter a number from 5 to 10");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
            } else {
                System.out.println("Mistake. Please, enter a number");
                scanner.next();
            }
        } while (number < 5 || number > 10);
        return number;
    }

    public static int[] getEvenElementFromArray(int[] array) {
        int[] preResult = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            } else {
                preResult[i - count] = array[i];
            }
        }
        return Arrays.copyOf(preResult, preResult.length - count);
    }

    /**
     * 2) Создайте массив и заполните массив.
     * Выведите массив на экран в строку.
     * Замените каждый элемент с нечётным индексом на ноль.
     * Снова выведете массив на экран на отдельной строке.
     */

    public static void deleteEvenElementFromArray() {
        int[] array = {3, 5, 67, 8, 9, 2, 4};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * 3) Создайте массив строк. Заполните его произвольными именами людей.
     * Отсортируйте массив.
     * Результат выведите на консоль.
     */

    public static String[] sortStringArray(String[] array) {
        Arrays.sort(array);
        return array;
    }

    /**
     * 4) Реализуйте алгоритм сортировки пузырьком.
     */

    public static int[] bubbleSorting(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
