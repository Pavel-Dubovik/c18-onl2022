package by.tms;


import by.tms.task2hw.Animal;
import by.tms.task2hw.Generic;
import by.tms.task2practice.*;
import by.tms.task3.MinMax;
import by.tms.task4.Calculator;

import java.io.File;

public class Homework {
    /**
     * <p>
     *
     * <p>
     *
     * <p>
     */
    public static void main(String[] args) {
        /**
         * 1) Список каталога
         * Написать метод который циклически просматривает содержимое заданного каталога и выводит на печать информацию о всех файлах и каталогах, находящихся в нем и в его подкаталогах.
         * Используем рекурсию.
         */

        System.out.println("\n\"Task 1\"\n");

        File dir = new File("Lesson16/src/main/java/by/tms/task1");
        printFileInfo(dir);

        /**
         * 2) Обобщенный класс с тремя параметрами
         * Создать обобщенный класс с тремя параметрами (T, V, K).
         * Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K),
         * методы возвращающие значения трех переменных. Создать метод, выводящий на консоль имена классов для трех переменных класса.
         * Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (String),
         * V должен реализовать интерфейс Serializable и расширять класс Animal, K должен расширять класс Number.
         */

        System.out.println("\n\"Task 2. Practice\"\n");

        Armchair<Frame, Material, Leg> armchair = new Armchair<>(new SolidFrame("R19"), new ClothMaterial("Nobas"), new SteelLeg(180));
        System.out.println(armchair.getFrame());
        System.out.println(armchair.getMaterial());
        System.out.println(armchair.getLeg());
        armchair.printClassName();

        System.out.println("\n\"Task 2\"\n");

        Generic<String, Animal, Double> gen = new Generic<>("тест", new Animal("Балу", 3), 59.5);
        System.out.println(gen.getT());
        System.out.println(gen.getV());
        System.out.println(gen.getK());
        gen.printClassName();

        /**
         * 3) Написать обобщенный класс MinMax, который содержит методы для нахождения минимального и максимального элемента массива.
         * Массив является переменной класса. Массив должен передаваться в класс через конструктор.
         * Написать метод принимающий MinMax объект и печатающий информацию об элементах.
         */

        System.out.println("\n\"Task 3\"\n");

        Integer[] arrayOfInteger = {56, 45, 89, 91, 9};
        Double[] arrayOfDouble = {5.6, 7.8, 3.5, 9.1};

        MinMax<?> minMaxInteger = new MinMax<>(arrayOfInteger);
        getInfo(minMaxInteger);
        minMaxInteger.getMax();
        minMaxInteger.getMin();

        MinMax<?> minMaxDouble = new MinMax<>(arrayOfDouble);
        getInfo(minMaxDouble);
        minMaxDouble.getMax();
        minMaxDouble.getMin();

        /**
         * 4) Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы - sum, multiply, divide,
         * subtraction. Параметры этих методов - два числа разного типа, над которыми должна быть произведена операция.
         */

        System.out.println("\n\"Task 4\"\n");

        System.out.println(Calculator.sum(5.6544, 9.354564648));
        System.out.println(Calculator.multiply(8.5646, 1.6584864));
        System.out.println(Calculator.divide(7.3, 7.3));
        System.out.println(Calculator.subtraction(2.94, 1.6135));
    }

    public static void printFileInfo(File catalog) {
        if (catalog.isDirectory()) {
            for (File item : catalog.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println(item.getName() + " folder");
                    printFileInfo(item);
                } else {
                    System.out.println(item.getName() + " file");
                }
            }
        } else {
            System.out.println("Каталог не существует");
        }
    }

    public static void getInfo(MinMax<?> minMax) {
        for (int i = 0; i < minMax.getArrayOfNumbers().length; i++) {
            System.out.println(minMax.getArrayOfNumbers()[i]);
        }
    }
}
