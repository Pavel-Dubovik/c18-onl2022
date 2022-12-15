package by.tms.task3.model;

public class Apricot extends Fruit {
    public Apricot(double weight, double price) {
        super(weight, price);
    }

    @Override
    public FruitType getType() {
        return FruitType.APRICOT;
    }
}
