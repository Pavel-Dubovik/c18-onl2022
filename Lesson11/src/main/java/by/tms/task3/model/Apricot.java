package by.tms.task3.model;

import static by.tms.task3.model.FruitType.APRICOT;

public class Apricot extends Fruit {
    public Apricot(double weight, double price) {
        super(weight, price);
    }

    @Override
    public FruitType getType() {
        return APRICOT;
    }
}
