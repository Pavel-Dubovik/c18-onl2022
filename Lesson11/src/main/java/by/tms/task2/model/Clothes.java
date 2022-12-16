package by.tms.task2.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public abstract class Clothes {
    private Size size;
    private String color;
    private int price;

    public Clothes(Size size, String color, int price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }
}
