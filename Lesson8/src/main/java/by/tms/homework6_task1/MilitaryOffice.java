package by.tms.homework6_task1;

public class MilitaryOffice {

    /**
     * Задача №1
     * Необходимо написать военкомат.
     * 1) Создаем класс военкомат by.tms.homework6_task1.MilitaryOffice
     * 2) Создать в классе by.tms.homework6_task1.MilitaryOffice конструктор, который принимает by.tms.homework6_task1.PersonRegistry
     * 3) by.tms.homework6_task1.PersonRegistry содержит список людей (by.tms.homework6_task1.Person), которые могут быть призваны в армию
     * 4) Создать класс by.tms.homework6_task1.Person, который будет содержать следующие поля имя, возраст, пол, адрес(страна, город)
     * Военкомат должен уметь:
     * a) вывести имена всех людей годных к военной службе на текущий момент времени, которые есть в by.tms.homework6_task1.PersonRegistry
     * T.е нужно написать метод в классе by.tms.homework6_task1.MilitaryOffice, который будет отфильтровывать годных к службе призывников
     * (годными считать мужчин от 18 до 27 лет, проверяем пол и возраст)
     * б) вывести количество годных призывников в городе Минске.
     * в) вывести количество призывников от 25 до 27 лет
     * г) вывести количество призывников у которых имя Александр.
     * 5) Создать класс Main, наполнить by.tms.homework6_task1.PersonRegistry людьми, по желанию можно создавать людей через консоль
     */

    private PersonRegistry personRegistry;
    private final int MIN_AGE = 18;
    private final int MAX_AGE = 27;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public Person[] findEligibleRecruits(String gender) {
        Person[] result = new Person[personRegistry.getPersons().length];
        for (int i = 0; i < personRegistry.getPersons().length; i++) {
            Person person = personRegistry.getPersons()[i];
            if (person.getGender().equals(gender) && person.getAge() >= MIN_AGE && person.getAge() <= MAX_AGE) {
                result[i] = person;
            }
        }
        return result;
    }

    public int findRecruitsByCity(String city) {
        int quantity = 0;
        for (int i = 0; i < personRegistry.getPersons().length; i++) {
            if (personRegistry.getPersons()[i].getAddress().getCity().equals(city)) {
                quantity++;
            }
        }
        return quantity;
    }

    public int findRecruitsByAge(int ageMin, int ageMax) {
        int quantity = 0;
        for (int i = 0; i < personRegistry.getPersons().length; i++) {
            Person person = personRegistry.getPersons()[i];
            if (person.getAge() >= ageMin && person.getAge() <= ageMax) {
                quantity++;
            }
        }
        return quantity;
    }

    public int findRecruitsByName(String name) {
        int quantity = 0;
        for (int i = 0; i < personRegistry.getPersons().length; i++) {
            if (personRegistry.getPersons()[i].getName().equals(name)) {
                quantity++;
            }
        }
        return quantity;
    }
}
