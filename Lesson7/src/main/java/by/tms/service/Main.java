package by.tms.service;

import by.tms.task2practice.Computer;

public class Main {
    public static void main(String[] args) {
        /**
         * в папке src/main/java создать пакет by.tms.model
         * в пакете создать класс Computer
         * 1) класс Computer будет содержать следующие поля:
         * - процессор
         * - оперативка
         * - жесткий диск
         * - ресурс полных циклов работы (включился выключился это один цикл)
         *
         * 2) класс Computer будет содержать следующие методы:
         * - метод описание(вывод всех полей)
         * - метод включить (on())
         *     - при включении может произойти сбой, поэтому при вызове метода on() необходимо написать следующую логику:
         *     на консоль вывести сообщение (Внимание! Введите 0 или 1)
         *     создать экземпляр класса Random, который будет генерировать число 0 или 1.
         *     если введенное вами число совпадет с рандомным, то компьютер выключается.
         *     если введенное вами число не совпадет с рандомным, то компьютер сгорает.
         *     - при повторном включении компьютера, если он сгорел необходимо выдать сообщение "Компьютер сгорел!"
         * - выключить (off()) Проверяем если компьютер не сгорел то пишем "Выключение компьютера" и уменьшаем счетчик
         *    ресурса полных циклов работы
         * - при превышении лимита ресурса комп сгорает. Пишем сообщение "Компьютер сгорел!"
         *
         * 3) создать пакет by.tms.service
         * создать класс Main создать метод main
         * создать экземпляр класса Computer или реальный объект, через конструктор передать значение полей класса,
         * т.е необходимо сгенерировать конструктор с полями класса перечисленными в 1 пункте
         * Далее у объекта Computer вызвать его методы, в которых будет реализована логика по включению, выключению
         * и выводу информации про него.
         */

        Computer computer2 = new Computer("AMD RYZEN 5500U", "DDR4 16 GB", "SSD 256 GB", 10);
        System.out.println(computer2);
        Computer computer1 = new Computer(2);
        System.out.println(computer1);
        for (int i = 0; i < 10; i++) {
            computer1.on();
            computer1.off();
            if (computer1.isBurned()) {
                break;
            }
        }
    }
}
