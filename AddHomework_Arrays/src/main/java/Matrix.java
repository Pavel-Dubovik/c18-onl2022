import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(createThreeDimensionalArray(1)));
        printArray(createChessBoard());
        System.out.println(calculateSumAllElement());
        printDiagonalElement();
        System.out.println(Arrays.deepToString(getSortDoubleArray()));
    }

    /**
     * 1) Создать трехмерный массив из целых чисел.
     * С помощью циклов "пройти" по всему массиву и увеличить каждый
     * элемент на заданное число. Пусть число, на которое будет
     * увеличиваться каждый элемент, задается из консоли.
     */

    public static int[][][] createThreeDimensionalArray(int number) {
        int[][][] array = new int[3][3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[j].length; k++) {
                    array[i][j][k] += number;
                }
            }
        }
        return array;
    }

    public static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Enter an integer");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
            } else {
                System.out.println("Mistake. Please, enter an integer");
                scanner.next();
            }
        } while (number < 0);
        return number;
    }

    /**
     * 2) Шахматная доска
     * Создать программу для раскраски шахматной доски с помощью цикла.
     * Создать двумерный массив String'ов 8х8. С помощью циклов задать
     * элементам циклам значения B(Black) или W(White). Результат работы
     * программы:
     * W B W B W B W B
     * B W B W B W B W
     * W B W B W B W B
     * B W B W B W B W
     * W B W B W B W B
     * B W B W B W B W
     * W B W B W B W B
     * B W B W B W B W
     */

    public static String[][] createChessBoard() {
        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j += 2) {
                if (i % 2 == 0) {
                    array[i][j] = "W";
                } else {
                    array[i][j] = "B";
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j += 2) {
                if (i % 2 == 0) {
                    array[i][j] = "B";
                } else {
                    array[i][j] = "W";
                }
            }
        }
        return array;
    }

    public static void printArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 3) Создайте двумерный массив целых чисел. Выведите на консоль сумму
     * всех элементов массива.
     */

    public static int calculateSumAllElement() {
        int[][] array = {{9, 5, 8, 2, 7, 9, 4}, {2, 4, 6, 7, 9, 2, 5}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    /**
     * 4) Создайте двумерный массив. Выведите на консоль диагонали массива.
     */

    public static void printDiagonalElement() {
        int[][] array = {{9, 5, 8},
                {2, 4, 6},
                {9, 2, 5}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i][array.length - 1 - i] + " ");
        }
    }

    /**
     * 5) Создайте двумерный массив целых чисел. Отсортируйте элементы в
     * строках двумерного массива по возрастанию.
     */

    public static int[][] getSortDoubleArray() {
        int[][] array = {{9, 5, 8, 3, 7, 9, 4}, {2, 1, 6, 7, 9, 2, 5}};
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
        return array;
    }

}
