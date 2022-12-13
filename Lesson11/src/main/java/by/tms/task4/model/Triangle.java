package by.tms.task4.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Triangle extends Figure implements ISquare {
    private double base;
    private double height;

    @Override
    public double getSquare() {
        return 0.5 * base * height;
    }

    @Override
    public FigureType getType() {
        return FigureType.TRIANGLE;
    }
}
