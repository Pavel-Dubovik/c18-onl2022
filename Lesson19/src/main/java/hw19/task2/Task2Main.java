package hw19.task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task2Main {
    /**
     * 2) Определение количества четных чисел в потоке данных.
     * Создаем коллекцию Set<Integer> в которую добавляем рандомно 50 чисел от 0 до 100
     */
    public static void main(String[] args) {

        Integer[] integers = new Integer[50];
        Random random = new Random();
        for (int i = 0; i < integers.length; i++) {
            integers[i] = random.nextInt(0, 101);
        }

        Set<Integer> numbers = new HashSet<>(Arrays.asList(integers));
        long result = numbers.stream()
                .filter(number -> number % 2 == 0)
                .count();
        System.out.println(result);
    }
}
