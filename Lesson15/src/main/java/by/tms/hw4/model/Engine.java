package by.tms.hw4.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class Engine implements Serializable {
    private String engineType;
    private transient int numberOfCylinders;
}
