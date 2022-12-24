package by.tms.hw4.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class Car implements Serializable {
    private String model;
    private final Engine engine;
    private final GasTank gasTank;
    private double maxSpeed;
    private BigDecimal price;

    public Car(String model, Engine engine, GasTank gasTank, double maxSpeed, int price) {
        this.model = model;
        this.engine = engine;
        this.gasTank = gasTank;
        this.maxSpeed = maxSpeed;
        this.price = BigDecimal.valueOf(price);
    }
}
