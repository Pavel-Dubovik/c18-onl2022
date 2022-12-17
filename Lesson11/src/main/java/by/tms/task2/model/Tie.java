package by.tms.task2.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Tie extends Clothes implements IMensClothing {
    public Tie(Size size, String color, int price) {
        super(size, color, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеть галстук. Размер: " + getSize() + ", цвет: " + getColor() + ", цена: " + getPrice());
    }
}
