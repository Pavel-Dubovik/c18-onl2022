package by.tms.task3;

import java.util.Arrays;
import java.util.Objects;

/**
 * 3)Написать обобщенный класс MinMax, который содержит методы для нахождения минимального и максимального элемента массива.
 * Массив является переменной класса. Массив должен передаваться в класс через конструктор.
 * Написать метод принимающий MinMax объект и печатающий информацию об элементах.
 */
public class MinMax<T extends Number> {
    private T[] arrayOfNumbers;

    public MinMax(T[] array) {
        Objects.requireNonNull(array);
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        this.arrayOfNumbers = array;
    }

    public void getMax() {
        Arrays.sort(arrayOfNumbers);
        System.out.println("Max element: " + arrayOfNumbers[arrayOfNumbers.length - 1]);
    }

    public void getMin() {
        Arrays.sort(arrayOfNumbers);
        System.out.println("Min element: " + arrayOfNumbers[0]);
    }

    public T[] getArrayOfNumbers() {
        return arrayOfNumbers;
    }
}
