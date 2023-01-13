package hw19.task4;

import java.util.Arrays;
import java.util.List;

public class Task4Main {
    /**
     * 4) Создаем класс Car с полями number (номер авто) и year (год выпуска).
     * Необходимо вывести все не пустые номера машин, выпущенных после 2010 года.
     */
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("1645-HM7", 2008),
                new Car("3952-HM5", 2012),
                new Car(null, 2016),
                new Car("", 2018),
                new Car("4936-HM3", 2011));

        cars.stream()
                .filter(car -> car.getCarNumber() != null && car.getCarNumber().length() > 0 && car.getYearOfRelease() > 2010)
                .forEach(System.out::println);
    }
}
