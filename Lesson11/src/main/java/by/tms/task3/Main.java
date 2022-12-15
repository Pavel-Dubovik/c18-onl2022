package by.tms.task3;

import by.tms.task3.model.*;

import static by.tms.task3.model.FruitType.APPLE;

public class Main {
    public static void main(String[] args) {
        /**
         *       Задача3
         *       Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его.
         *       Класс Фрукт содержит:
         *       а) переменную вес,
         *       б) метод printManufacturerInfo(){System.out.print("Made in Belarus");} который нельзя изменить в наследнике.
         *       в) абстрактный метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике.
         *       Метод должен учитывать вес фрукта(Т.е в зависимости от веса разная цена)
         *       Создать несколько объектов разных классов.
         *       Подсчитать общую стоимость проданных фруктов.
         *       А также общую стоимость отдельно проданных яблок, груш и абрикос.
         */

        Fruit[] fruits = new Fruit[9];
        fruits[0] = new Apple(23, 0.15);
        fruits[1] = new Apple(23, 0.17);
        fruits[2] = new Apple(23, 0.13);
        fruits[3] = new Pear(35, 0.25);
        fruits[4] = new Pear(35, 0.20);
        fruits[5] = new Pear(35, 0.19);
        fruits[6] = new Apricot(40, 0.09);
        fruits[7] = new Apricot(40, 0.11);
        fruits[8] = new Apricot(40, 0.13);

        System.out.println(calculateTotalPrice(fruits));
        System.out.println(calculateFruitPrice(fruits, APPLE));
    }

    public static double calculateTotalPrice(Fruit[] fruits) {
        double sum = 0;
        for (int i = 0; i < fruits.length; i++) {
            sum += fruits[i].getPrice();
        }
        return sum;
    }

    public static double calculateFruitPrice(Fruit[] fruits, FruitType type) {
        double sum = 0;
        for (Fruit fruit : fruits) {
            if (fruit.getType() == type) {
                sum += fruit.getPrice();
            }
        }
        return sum;
    }
}
