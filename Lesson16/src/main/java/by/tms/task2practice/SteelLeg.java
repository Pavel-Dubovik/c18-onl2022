package by.tms.task2practice;

import lombok.ToString;

@ToString
public class SteelLeg extends Leg {
    private double height;

    public SteelLeg(double height) {
        this.height = height;
    }
}
