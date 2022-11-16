import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork5Additional {
    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int MARCH = 3;
    public static final int APRIL = 4;
    public static final int MAY = 5;
    public static final int JUNE = 6;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int SEPTEMBER = 9;
    public static final int OCTOBER = 10;
    public static final int NOVEMBER = 11;
    public static final int DESEMBER = 12;

    public static void main(String[] args) {
        printDay();
        calculateAmoeba();
        printNumber(0);
        printNumber(-4);
        printNumber(55);
        identifyTheZodiacSign(11, 10);
        System.out.println(summ(1, 3));
        System.out.println(summ(-1, -3));
        System.out.println(summ(-1, 3));
        System.out.println(summ(1, -3));
        System.out.println(summ(0, 1));
        System.out.println(summ(1, 0));
        arrayA();
        arrayB();
        arrayC();
        arrayD();
        reverseArray();
        randomMaxValue();
        replaceElement();
        findMaxValue();
        checkArrayElements(new int[]{1, 3, 7, 4, 7, 9, 5, 9});
        transposeTheMatrix();
        calculateSumOfDiagonalElements();
        printTheModifiedMatrix();
        printSumAndIndexes();
    }

    /**
     * 1) Задача на оператор switch!
     * Рандомно генерируется число От 1 до 7.
     * Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
     * Если 6 или 7 – “Выходной”.
     */

    public static void printDay() {
        int number = (int) (Math.random() * 7) + 1;
        System.out.println(
                switch (number) {
                    case 1 -> "Monday";
                    case 2 -> "Tuesday";
                    case 3 -> "Wednesday";
                    case 4 -> "Thursday";
                    case 5 -> "Friday";
                    case 6, 7 -> "Weekend";
                    default -> throw new IllegalStateException("Unexpected value: " + number);
                }
        );
    }

    /**
     * 2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
     * сколько амеб будет через 3, 6, 9, 12,..., 24 часа
     */

    public static void calculateAmoeba() {
        int amoeba = 1;
        for (int i = 3; i <= 24; i += 3) {
            amoeba *= 2;
            System.out.println("There will be " + amoeba + " amoebas in " + i + " hours");
        }
    }

    /**
     * 3) В переменную записываем число.
     * Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
     * Например, введите число: 5
     * "5" - это положительное число, количество цифр = 1"
     */

    public static void printNumber(int number) {
        int temp = number;
        int length = 1;
        while (temp != 0) {
            length++;
            temp *= 10;
        }
        if (number > 0) {
            System.out.println(number + " - is a positive number, quantity digits = " + length);
        } else if (number < 0) {
            System.out.println(number + " - is a negative number, quantity digits = " + length);
        } else {
            System.out.println(number + " - is a 0, quantity digits = " + length);
        }
    }

    /**
     * 4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.
     */

    public static void identifyTheZodiacSign(int month, int day) {
        switch (month) {
            case 1 -> {
                if (day >= 1 && day <= 31) {
                    System.out.println(day <= 19 ? "Козерог" : "Водолей");
                } else {
                    System.out.println("Вы ввели неверный день!");
                }
            }
            case 2 -> {
                if (day >= 1 && day <= 28) {
                    System.out.println(day <= 18 ? "Водолей" : "Рыбы");
                } else {
                    System.out.println("Вы ввели неверный день!");
                }
            }
            case 3 -> {
                if (day >= 1 && day <= 31) {
                    System.out.println(day <= 20 ? "Рыбы" : "Овен");
                } else {
                    System.out.println("Вы ввели неверный день!");
                }
            }
            case 4 -> {
                if (day >= 1 && day <= 30) {
                    System.out.println(day <= 19 ? "Овен" : "Телец");
                } else {
                    System.out.println("Вы ввели неверный день!");
                }
            }
            case 5 -> {
                if (day >= 1 && day <= 31) {
                    System.out.println(day <= 20 ? "Телец" : "Близнецы");
                } else {
                    System.out.println("Вы ввели неверный день!");
                }
            }
            case 6 -> {
                if (day >= 1 && day <= 30) {
                    System.out.println(day <= 20 ? "Близнецы" : "Рак");
                } else {
                    System.out.println("Вы ввели неверный день!");
                }
            }
            case 7 -> {
                if (day >= 1 && day <= 31) {
                    System.out.println(day <= 22 ? "Рак" : "Лев");
                } else {
                    System.out.println("Вы ввели неверный день!");
                }
            }
            case 8 -> {
                if (day >= 1 && day <= 31) {
                    System.out.println(day <= 22 ? "Лев" : "Дева");
                } else {
                    System.out.println("Вы ввели неверный день!");
                }
            }
            case 9 -> {
                if (day >= 1 && day <= 30) {
                    System.out.println(day <= 22 ? "Дева" : "Весы");
                } else {
                    System.out.println("Вы ввели неверный день!");
                }
            }
            case 10 -> {
                if (day >= 1 && day <= 31) {
                    System.out.println(day <= 22 ? "Весы" : "Скорпион");
                } else {
                    System.out.println("Вы ввели неверный день!");
                }
            }
            case 11 -> {
                if (day >= 1 && day <= 30) {
                    System.out.println(day <= 21 ? "Скорпион" : "Стрелец");
                } else {
                    System.out.println("Вы ввели неверный день!");
                }
            }
            case 12 -> {
                if (day >= 1 && day <= 31) {
                    System.out.println(day <= 21 ? "Стрелец" : "Козерог");
                } else {
                    System.out.println("Вы ввели неверный день!");
                }
            }
            default -> System.out.println("Вы ввели неверный месяц!");
        }
    }

    public boolean checkDay(int day, int from, int to) {
        return day >= from && day <= to;
    }

    public String identifyTheZodiacSignSolution2(int month, int day) {
        return switch (month) {
            case JANUARY -> checkDay(day, 1, 19) ? "Козерог" : checkDay(day, 20, 31) ? "Водолей" : null;
            case FEBRUARY -> checkDay(day, 1, 18) ? "Водолей" : checkDay(day, 19, 28) ? "Рыбы" : null;
            case MARCH -> checkDay(day, 1, 20) ? "Рыбы" : checkDay(day, 21, 31) ? "Овен" : null;
            case APRIL -> checkDay(day, 1, 19) ? "Овен" : checkDay(day, 20, 30) ? "Телец" : null;
            case MAY -> checkDay(day, 1, 20) ? "Телец" : checkDay(day, 21, 31) ? "Близнецы" : null;
            case JUNE -> checkDay(day, 1, 20) ? "Близнецы" : checkDay(day, 21, 30) ? "Рак" : null;
            case JULY -> checkDay(day, 1, 22) ? "Рак" : checkDay(day, 23, 31) ? "Лев" : null;
            case AUGUST -> checkDay(day, 1, 22) ? "Лев" : checkDay(day, 23, 31) ? "Дева" : null;
            case SEPTEMBER -> checkDay(day, 1, 22) ? "Дева" : checkDay(day, 23, 30) ? "Весы" : null;
            case OCTOBER -> checkDay(day, 1, 22) ? "Весы" : checkDay(day, 23, 31) ? "Скорпион" : null;
            case NOVEMBER -> checkDay(day, 1, 21) ? "Скорпион" : checkDay(day, 22, 30) ? "Стрелец" : null;
            case DESEMBER -> checkDay(day, 1, 21) ? "Стрелец" : checkDay(day, 22, 30) ? "Козерог" : null;
            default -> null;
        };
    }

    /**
     * 5) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
     * умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
     */
    public static int summ(int a, int b) {
        int result = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            result += Math.abs(a);
        }
        if ((a < 0 && b < 0) || (a > 0 && b > 0)) {
            return result;
        } else if (a < 0 || b < 0) {
            return -result;
        } else {
            return 0;
        }
    }


    /**
     * //        6) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида
     * <p>
     * //        a)                  b)
     * //              *        *
     * //            * *        * *
     * //          * * *        * * *
     * //        * * * *        * * * *
     * //
     * //        c)                  d)
     * //        * * * *        * * * *
     * //          * * *        * * *
     * //            * *        * *
     * //              *        *
     */

    public static void arrayB() {
        char[][] array = new char[4][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new char[i + 1];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '*';
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayD() {
        char[][] array = new char[4][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new char[array.length - i];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '*';
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayA() {
        char[][] array = new char[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j >= array[i].length - 1 - i) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = ' ';
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayC() {
        char[][] array = new char[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                if (j <= array[i].length - 1 - i) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = ' ';
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    /**
     * 7) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
     * а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
     */

    public static void reverseArray() {
        int[] array = new int[100];
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                array[i] = i;
            }
        }
        Arrays.sort(array);
        int[] sortedArray = new int[array.length / 2];
        System.arraycopy(array, 50, sortedArray, 0, 50);
        System.out.println(Arrays.toString(sortedArray));
        int[] reverseArray = new int[sortedArray.length];
        int indexReverseArray = 0;
        for (int i = sortedArray.length - 1; i >= 0; i--) {
            reverseArray[indexReverseArray++] = sortedArray[i];
        }
        System.out.println(Arrays.toString(reverseArray));
    }

    /**
     * 8) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
     * Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
     * Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
     */

    public static void randomMaxValue() {
        int[] mass = new int[12];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(0, 16);
        }
        System.out.println(Arrays.toString(mass));
        int maxValue = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > maxValue) {
                maxValue = mass[i];
            }
        }
        System.out.println(maxValue);
        for (int i = mass.length - 1; i >= 0; i--) {
            if (maxValue == mass[i]) {
                System.out.println(i);
                break;
            }
        }
    }

    /**
     * 9) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
     * Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
     * Снова выведете массив на экран на отдельной строке.
     */

    public static void replaceElement() {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 21);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * 10) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом.
     */

    public static void findMaxValue() {
        int[] array = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int maxValue = array[0];
        for (int i : array) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        System.out.println(maxValue);
        int indexMaxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxValue) {
                indexMaxValue = i;
            }
        }
        System.out.println(indexMaxValue);
        int temp = array[0];
        array[0] = maxValue;
        array[indexMaxValue] = temp;
        System.out.println(Arrays.toString(array));
    }

    /**
     * 11) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
     * Пример: {0,3,46,3,2,1,2}
     * Массив имеет повторяющиеся элементы 3, 2
     * Пример: {0,34,46,31,20,1,28}
     * Массив не имеет повторяющихся элементов
     */

    public static void checkArrayElements(int[] array) {
        int[] temp = new int[array.length];
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    result[i] = array[j];
                }
            }
        }
        if (!(Arrays.equals(temp, result))) {
            System.out.print("The array has duplicate elements: ");
            for (int i = 0; i < result.length; i++) {
                if (result[i] != 0) {
                    System.out.print(result[i] + ", ");
                }
            }
            System.out.println("\b\b");
        } else {
            System.out.println("The array don't have duplicate elements.");
        }
    }

    /**
     * 12) Создаём квадратную матрицу, размер вводим с клавиатуры.
     * Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
     * Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
     * Пример:
     * 1 2 3 4      1 6 3 1
     * 6 7 8 9      2 7 3 5
     * 3 3 4 5      3 8 4 6
     * 1 5 6 7      4 9 5 7
     */

    public static void transposeTheMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int line = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int column = scanner.nextInt();
        int[][] squareMatrix = new int[line][column];

        Random random = new Random();
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                squareMatrix[i][j] = random.nextInt(0, 51);
            }
        }

        printMatrix(squareMatrix);

        System.out.println();
        int[][] transposeMatrix = new int[line][column];
        for (int i = 0; i < transposeMatrix.length; i++) {
            for (int j = 0; j < transposeMatrix[i].length; j++) {
                transposeMatrix[i][j] = squareMatrix[j][i];
            }
        }

        printMatrix(transposeMatrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%4d", anInt);
            }
            System.out.println();
        }
    }

    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */

    public static void calculateSumOfDiagonalElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int line = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int column = scanner.nextInt();
        int[][] matrix = new int[line][column];

        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(0, 51);
            }
        }

        printMatrix(matrix);

        System.out.println();
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    /**
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */
    public static void printTheModifiedMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int line = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int column = scanner.nextInt();
        int[][] matrix = new int[line][column];

        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(0, 101);
            }
        }

        printMatrix(matrix);

        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 3 == 0 && matrix[i][j] % 7 == 0) {
                    System.out.printf("%4c", '+');
                } else if (matrix[i][j] % 3 == 0) {
                    System.out.printf("%4c", '+');
                } else if (matrix[i][j] % 7 == 0) {
                    System.out.printf("%4c", '-');
                } else {
                    System.out.printf("%4d", matrix[i][j]);
                }
            }
            System.out.println();
        }
    }

    /**
     * Доп задача!
     * Создать матрицу размера 10 на 10 и заполнить ее случайными целочисленными значениями (тип int) из диапазона от 0 до 10000.
     * Найти максимум среди сумм трех соседних элементов в строке. Для найденной тройки с максимальной суммой выведите значение суммы и индексы(i,j) первого элемента тройки.
     * Пример:
     * *Для простоты пример показан на одномерном массиве размера 10
     * [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254] Тройка с максимальной суммой:  [2789, 4, 8742]
     * Вывод в консоль:
     * 11535 (0,5)
     * *Пояснение. Первое число - сумма тройки  [2789, 4, 8742]. Числа в скобках это 0 строка и 5 столбец - индекс первого элемента тройки, то есть индекс числа 2789.
     */

    public static void printSumAndIndexes() {
        int[][] matrix = new int[10][10];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(0, 10001);
            }
        }
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%6d", anInt);
            }
            System.out.println();
        }
        System.out.println();
        int[][] sumDoubleArray = new int[10][];
        for (int i = 0; i < matrix.length; i++) {
            sumDoubleArray[i] = new int[sumDoubleArray.length - 2];
            for (int j = 1; j < matrix[i].length - 1; j++) {
                int sum = matrix[i][j - 1] + matrix[i][j] + matrix[i][j + 1];
                System.out.printf("%5d%s%5d%s%5d%s%-7d%s", matrix[i][j - 1], " +", matrix[i][j], " +", matrix[i][j + 1], " = ", sum, " | ");
                sumDoubleArray[i][j - 1] = sum;
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < sumDoubleArray.length; i++) {
            int maxSum = sumDoubleArray[i][0];
            int rowIndex = 0;
            int columnIndex = 0;
            for (int j = 0; j < sumDoubleArray[i].length; j++) {
                if (sumDoubleArray[i][j] > maxSum) {
                    maxSum = sumDoubleArray[i][j];
                    rowIndex = i;
                    columnIndex = j;
                }
            }
            System.out.println("Maximum amount: " + maxSum + " (" + rowIndex + ", " + columnIndex + ")");
        }
    }
}