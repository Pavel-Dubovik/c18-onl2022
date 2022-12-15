package by.tms.task2;

import by.tms.task2.model.*;

import static by.tms.task2.model.ClothesType.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Задача2: Одежда
         *
         *       1) Создать перечисление, содержащее размеры одежды (XXS, XS, S, M, L).
         *       Перечисление содержит метод getDescription, возвращающий строку "Взрослый размер".
         *       Переопределить метод getDescription - для константы XXS метод должен возвращать строку “Детский размер”.
         *       Также перечисление должно содержать числовое значение euroSize(32, 34, 36, 38, 40), соответствующее каждому размеру.
         *       Создать конструктор, принимающий на вход euroSize.
         *       2) Создать интерфейсы "Мужская Одежда" с методом "одетьМужчину" и "Женская Одежда" с методом "одетьЖенщину".
         *       3) Создать абстрактный класс Одежда, содержащий переменные - размер одежды, стоимость, цвет.
         *       4) Создать классы наследники Одежды - Футболка (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"),
         *       Штаны (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"), Юбка (реализует интерфейсы "Женская Одежда"),
         *       Галстук (реализует интерфейсы "Мужская Одежда").
         *       5) Создать массив, содержащий все типы одежды. Создать класс Ателье, содержащий методы одетьЖенщину,
         *       одетьМужчину, на вход которых будет поступать массив, содержащий все типы одежды.
         *       Метод одетьЖенщину выводит на консоль всю информацию о женской одежде. То же самое для метода одетьМужчину.
         */

        Clothes[] clothes = new Clothes[4];
        clothes[0] = createClothes(TSHIRT, Size.L, "красный", 80);
        clothes[1] = createClothes(PANTS, Size.XS, "белый", 100);
        clothes[2] = createClothes(SKIRT, Size.XXS, "фиолетовый", 70);
        clothes[3] = createClothes(TIE, Size.M, "черный", 40);

        Atelier atelier = new Atelier(clothes);
        atelier.dressMan();
        atelier.dessWoman();
    }

    private static Clothes createClothes(ClothesType type, Size size, String color, int price) {
        return switch (type) {
            case TSHIRT -> Tshirt.builder()
                    .size(size)
                    .color(color)
                    .price(price)
                    .build();
            case PANTS -> Pants.builder()
                    .size(size)
                    .color(color)
                    .price(price)
                    .build();
            case SKIRT -> Skirt.builder()
                    .size(size)
                    .color(color)
                    .price(price)
                    .build();
            case TIE -> Tie.builder()
                    .size(size)
                    .color(color)
                    .price(price)
                    .build();
            default -> throw new IllegalArgumentException("Unknown type");
        };
    }
}
