package by.tms.inheritance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Ground extends Transport {
    private int numberOfWheels;
    private double averageFuelConsumption;

    @Override
    public String getDescription() {
        return super.getDescription() +
                "\nКоличество колес - " + numberOfWheels +
                "\nРасход топлива - " + averageFuelConsumption + " л/100км";
    }


}
