package by.tms.homework6_task1;

public class Main {
    public static void main(String[] args) {
        // MilitaryOffice militaryOffice1 = new MilitaryOffice()
        Person[] mens = new Person[20];
        mens[0] = new Person("Вячеслав", 18, "мужчина", new Address("Беларусь", "Минск"));
        mens[1] = new Person("Олег", 25, "мужчина", new Address("Беларусь", "Минск"));
        mens[2] = new Person("Александр", 22, "мужчина", new Address("Беларусь", "Минск"));
        mens[3] = new Person("Максим", 19, "мужчина", new Address("Беларусь", "Минск"));
        mens[4] = new Person("Юрий", 24, "мужчина", new Address("Беларусь", "Минск"));
        mens[5] = new Person("Сергей", 36, "мужчина", new Address("Беларусь", "Минск"));
        mens[6] = new Person("Никита", 18, "мужчина", new Address("Беларусь", "Минск"));
        mens[7] = new Person("Виктор", 24, "мужчина", new Address("Беларусь", "Минск"));
        mens[8] = new Person("Алексей", 30, "мужчина", new Address("Беларусь", "Минск"));
        mens[9] = new Person("Антон", 20, "мужчина", new Address("Беларусь", "Минск"));
        mens[10] = new Person("Вячеслав", 27, "мужчина", new Address("Беларусь", "Минск"));
        mens[11] = new Person("Олег", 25, "мужчина", new Address("Беларусь", "Минск"));
        mens[12] = new Person("Александр", 29, "мужчина", new Address("Беларусь", "Минск"));
        mens[13] = new Person("Максим", 19, "мужчина", new Address("Беларусь", "Минск"));
        mens[14] = new Person("Юрий", 24, "мужчина", new Address("Беларусь", "Минск"));
        mens[15] = new Person("Сергей", 28, "мужчина", new Address("Беларусь", "Минск"));
        mens[16] = new Person("Никита", 20, "мужчина", new Address("Беларусь", "Минск"));
        mens[17] = new Person("Виктор", 34, "мужчина", new Address("Беларусь", "Минск"));
        mens[18] = new Person("Алексей", 24, "мужчина", new Address("Беларусь", "Минск"));
        mens[19] = new Person("Антон", 28, "мужчина", new Address("Беларусь", "Минск"));


        MilitaryOffice militaryOffice1 = new MilitaryOffice(new PersonRegistry(mens));
        militaryOffice1.printEligibleRecruits("мужчина");
        militaryOffice1.printCity("Минск");
        militaryOffice1.printAge(25, 27);
        militaryOffice1.printName("Александр");

    }
}
