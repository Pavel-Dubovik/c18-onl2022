package by.tms.task2.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Pants extends Clothes implements IMensClothing, IWomenClothing {
    public Pants(Size size, String color, int price) {
        super(size, color, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеть мужские штаны. Размер: " + getSize() + ", цвет: " + getColor() + ", цена: " + getPrice());
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеть женские штаны. Размер: " + getSize() + ", цвет: " + getColor() + ", цена: " + getPrice());
    }
}
