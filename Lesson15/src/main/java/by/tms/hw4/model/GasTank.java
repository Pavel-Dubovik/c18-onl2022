package by.tms.hw4.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class GasTank implements Serializable {
    private double totalVolume;
    private String fuelType;
}
