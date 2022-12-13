package by.tms.task4.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Rectangle extends Figure implements ISquare {
    private int sideA;
    private int sideB;

    @Override
    public double getSquare() {
        return sideA * sideB;
    }

    @Override
    public FigureType getType() {
        return FigureType.RECTANGLE;
    }
}
