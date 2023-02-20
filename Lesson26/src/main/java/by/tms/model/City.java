package by.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class City {
    private Integer cityId;
    private String name;

    public City(String name) {
        this.name = name;
    }
}