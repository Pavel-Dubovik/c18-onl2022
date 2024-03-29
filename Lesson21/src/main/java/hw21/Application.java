package hw21;

import hw21.model.Student;
import hw21.utils.CRUDUtils;

public class Application {
    /**
     * Основное задание
     * 1. Скачать и установить СУБД PostgreSQL. Создать таблицу с данными
     * студентов группы. Создать Java приложение для получения списка всех
     * студентов группы.
     * Дополнительное задание
     * 2. Улучшить основное задание. Создать таблицу с городами, где живут
     * студенты. Вывести информацию о каждом студенте группы и его родном
     * городе. Предусмотреть операции добавления новых городов, новых
     * студентов, удаления студентов и удаления городов.
     * <p>
     * За основу можно взять из моего репозитория приложение и его доработать!
     */
    public static void main(String[] args) {
        Student student1 = new Student("Павел", "Дубовик", "Java developer");
        Student student2 = new Student("Александр", "Нортин", "Java developer");
        Student student3 = new Student("Евгений", "Барсуков", "Java developer");
        Student student4 = new Student("Евгений", "Анженко", "Java developer");
        Student student5 = new Student("Павел", "Ярошевич", "Java developer");
        Student student6 = new Student("Виктория", "Карпичко", "Java developer");
        Student student7 = new Student("Ольга", "Ципалева", "Java developer");
        Student student8 = new Student("Степан", "Ткачук", "Java developer");
        Student student9 = new Student("Павел", "Ярошевич", "Java developer");
        Student student10 = new Student("Павел", "Мутовкин", "Java developer");
        Student student11 = new Student("Никита", "Татарский", "Java developer");
        Student student12 = new Student("Максим", "Линник", "Java developer");

        /*CRUDUtils.saveStudent(student1);
        CRUDUtils.saveStudent(student2);
        CRUDUtils.saveStudent(student3);
        CRUDUtils.saveStudent(student4);
        CRUDUtils.saveStudent(student5);
        CRUDUtils.saveStudent(student6);
        CRUDUtils.saveStudent(student7);
        CRUDUtils.saveStudent(student8);
        CRUDUtils.saveStudent(student9);
        CRUDUtils.saveStudent(student10);
        CRUDUtils.saveStudent(student11);
        CRUDUtils.saveStudent(student12);*/

//        System.out.println(CRUDUtils.getAllStudents());
//        System.out.println(CRUDUtils.updateStudent(1, "Кройки и шитья"));
//        System.out.println(CRUDUtils.deleteStudent(7));

        /*CRUDUtils.saveCity(1, "Минск");
        CRUDUtils.saveCity(2, "Минск");
        CRUDUtils.saveCity(3, "Минск");
        CRUDUtils.saveCity(4, "Минск");
        CRUDUtils.saveCity(5, "Минск");
        CRUDUtils.saveCity(6, "Гродно");
        CRUDUtils.saveCity(8, "Москва");
        CRUDUtils.saveCity(9, "Витебск");
        CRUDUtils.saveCity(10, "Гомель");
        CRUDUtils.saveCity(11, "Могилев");
        CRUDUtils.saveCity(12, "Брест");*/

        CRUDUtils.getAllStudentWithCities().forEach(System.out::println);
    }
}
