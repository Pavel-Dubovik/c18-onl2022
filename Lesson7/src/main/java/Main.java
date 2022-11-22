public class Main {
    public static void main(String[] args) {
        /**
         * 1) Создать класс User для хранения о обработки данных о пользователе.
         * Создать поля для хранения имени и фамилии, возраста и пола. Создать методы для:
         *  - Возврата имени и фамилии полностью
         *  - Увеличения возраста
         *  - Вывода общей информации о пользователе
         *  В Main классе в методе main создайте экземпляр класса User и вызовите все созданные методы, передав им необходимые параметры.
         * 2) Создать в классе User несколько конструкторов. Создать объект этого класса, использовав один из них.
         * В этом конструкторе сделать вызов другого конструктора этого же класса.
         * Отметьте один из методов как @Deprecated. Попробуйте на экземпляре класса вызвать этот метод.
         */
        User user1 = new User("Pavel", "Dubovik");
        System.out.println(user1);

        User user2 = new User("Pavel", "Dubovik", 35);
        System.out.println(user2);

        User user3 = new User("Pavel", "Dubovik", 35, "male");
        System.out.println(user3);

        User user4 = new User(35, "Pavel");
        System.out.println(user4);

        User user5 = new User();
        System.out.println(user5.getFullName("Pavel", "Dubovik"));

        user5.increaseAge(35);
        System.out.println(user5);

        user3.printInfo("Pavel", "Dubovik", 35, "male");

    }
}
