package by.tms.task4.model;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Line extends Figure {
    private double length;

    @Override
    public FigureType getType() {
        return FigureType.LINE;
    }
}
