package hw21.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Student {
    private int id;
    private String name;
    private String surname;
    private String course;

    public Student(String name, String surname, String course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

}