package by.tms.enums.seasons;

public class Main {
    public static void main(String[] args) {
        /**
         * Задача1: Времена года
         *   1) Создать перечисление(enum), содержащее названия времен года.
         *   2) Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем.
         *   3) Создать метод, который принимает на вход переменную созданного вами enum типа.
         *    Если значение равно Лето, выводим на консоль “Я люблю лето” и так далее. Используем оператор switch.
         *   4) Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
         *   5) Добавить конструктор принимающий на вход среднюю температуру.
         *   6) Создать метод getDescription, возвращающий строку “Холодное время года”.
         *    Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
         *   7) В цикле распечатать все времена года, среднюю температуру и описание времени года.
         */
        Season season = Season.SUMMER;
        System.out.println(season);

        printSeason(season);

        for (Season value : Season.values()) {
            System.out.println("Время года \"" + value.getName() + "\", средняя температура: " + value.getAverageTemperature()
                    + " градусов" + ". Это " + value.getDescription());
        }
    }

    public static void printSeason(Season name) {
        switch (name) {
            case WINTER -> System.out.println("I like a winter");
            case SPRING -> System.out.println("I like a spring");
            case SUMMER -> System.out.println("I like a summer");
            case AUTUMN -> System.out.println("I like a autumn");
        }
    }
}
