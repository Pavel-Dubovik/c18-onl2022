package by.tms.task3.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Fruit {
    private double weight;
    private double price;

    public Fruit(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    public final void printManufacturerInfo() {
        System.out.println("Made in Belarus");
    }

    public double getPrice() {
        return weight * price;
    }

    public abstract FruitType getType();
}
