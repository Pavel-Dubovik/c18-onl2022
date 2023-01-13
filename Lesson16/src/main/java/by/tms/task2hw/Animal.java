package by.tms.task2hw;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Animal implements Serializable {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

