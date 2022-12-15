package by.tms.task3.model;

public class Pear extends Fruit {
    public Pear(double weight, double price) {
        super(weight, price);
    }

    @Override
    public FruitType getType() {
        return FruitType.PEAR;
    }
}
