package by.tms.homework6_task1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonRegistry {
    private final Person[] persons;

    public PersonRegistry(Person[] persons) {
        this.persons = persons;
    }
}
