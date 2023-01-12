package by.tms.hw18.task1;

import by.tms.hw18.task1.model.Car;
import by.tms.hw18.task1.service.CarIsNotReadyException;

public class Main {
    public static void main(String[] args) {
        /**
         *1) Можно добработать свой авто из предыдущей домашки, а можно заново сделать.
         *       Создать собственное исключение.
         *       - Создать класс Car c полями (марка, скорость, цена), конструкторы (с параметрами и default) гетеры-сетеры.
         *       Создать метод старт в котором пытаетесь завести автомобиль. В методе старт генерируете случайное число от 0 до 20, если полученное число оказалось четным,
         *       то выбрасываете созданное ранее вами исключение и передаете его к месту откуда вызывали метод старт. Если все хорошо и исключение не вылетело,
         *       то выводить в консоль сообщение что автомобиль с такой-то маркой завелся.
         *       В main создаете парочку автомобилей и пытаетесь их завести. И обрабатываете исключение которое может вылететь при старте автомобиля
         */

        Car toyota = new Car("Toyota", 260, 50000);
        try {
            toyota.startCar();
        } catch (CarIsNotReadyException e) {
            e.printStackTrace();
        }
        Car bmw = new Car("BMW", 310, 110000);
        try {
            bmw.startCar();
        } catch (CarIsNotReadyException e) {
            e.printStackTrace();
        }
        Car reno = new Car("Reno", 190, 30000);
        try {
            reno.startCar();
        } catch (CarIsNotReadyException e) {
            e.printStackTrace();
        }
    }
}
