package by.tms.inheritance;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class Civil extends Air {
    private int numberOfPassengers;
    private boolean businessClassAvailability;

    @Override
    public String getDescription() {
        return super.getDescription() +
                "\nКоличество пассажиров - " + numberOfPassengers +
                "\nНаличие бизнес-класса - " + businessClassAvailability;
    }

    public void checkNumberOfPassengers(int number) {
        if (number <= numberOfPassengers) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }
}
