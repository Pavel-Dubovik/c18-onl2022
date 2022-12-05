package by.tms.inheritance;


import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor

public class Transport {
    private double power;
    private double speedMax;
    private double weight;
    private String brand;

    public String getDescription() {
        return "Марка - " + brand +
                "\nМощность - " + power + " лошадиных сил" + " или " + convertToKilowatt(power) + " киловатт" +
                "\nМаксимальная скорость - " + speedMax + " км/ч" +
                "\nМасса - " + weight + " кг";
    }

    public double convertToKilowatt(double power) {
        return power * 0.74;
    }

}
