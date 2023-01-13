package hw19.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1Main {
    /**
     * 1) Вывести список чисел, умноженных на 2. Список чисел задаем рандомно.
     */
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(getRandomNumber());
        numbers.add(getRandomNumber());
        numbers.add(getRandomNumber());
        numbers.add(getRandomNumber());
        numbers.add(getRandomNumber());

        System.out.println(numbers);

        numbers.stream()
                .map(integer -> integer * 2)
                .limit(5)
                .forEach(System.out::println);
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(0, 10);
    }
}
