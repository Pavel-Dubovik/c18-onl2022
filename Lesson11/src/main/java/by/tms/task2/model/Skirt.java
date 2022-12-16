package by.tms.task2.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Skirt extends Clothes implements IWomenClothing {
    public Skirt(Size size, String color, int price) {
        super(size, color, price);
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеть юбку. Размер: " + getSize() + ", цвет: " + getColor() + ", цена: " + getPrice());
    }
}
