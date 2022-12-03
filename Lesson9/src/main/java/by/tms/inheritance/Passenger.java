package by.tms.inheritance;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Passenger extends Ground {
    private String bodyType;
    private int numberOfPassengers;

    @Override
    public String getDescription() {
        return super.getDescription() +
                "\nТип кузова - " + bodyType +
                "\nКоличество пассажиров - " + numberOfPassengers;
    }

    public String calculateRangeAndVolume(double time) {
        double range = getSpeedMax() * time;
        return "За время " + time + " ч. автомобиль " + getBrand() + ", двигаясь с максимальной скоростью " +
                getSpeedMax() + " км/ч. проедет " + range + " км. и израсходует " + calculateFuelConsumption(time) + " литров топлива.";
    }

    private double calculateFuelConsumption(double time) {
        return (getAverageFuelConsumption() * (getSpeedMax() * time)) / 100;
    }
}


