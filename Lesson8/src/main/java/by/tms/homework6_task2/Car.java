package by.tms.homework6_task2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Car {
    private String carBrand;
    private int yearOfRelease;
    private double mileage;
    private final Engine engine;
    private final GasTank gasTank;
    private double range = 10;
    private boolean isStarted;

    public Car(Engine engine, GasTank gasTank) {
        this.engine = engine;
        this.gasTank = gasTank;
    }

    public void printCurrentMileage() {
        System.out.println(mileage);
        ;
    }

    private double calculateFuelConsumption() {
        return engine.getFuelConsumption() * range / 100;
    }

    private void calculateCurrentFuelVolume() {
        gasTank.setCurrentVolume(gasTank.getCurrentVolume() - calculateFuelConsumption());
    }

    public void printCurrentFuelVolume() {
        System.out.println(gasTank.getCurrentVolume());
    }

    public void refuel(double fuelVolume) {
        gasTank.setCurrentVolume(gasTank.getCurrentVolume() + fuelVolume);
    }

    public void engineOn() {
        calculateCurrentFuelVolume();
        if (gasTank.getCurrentVolume() > 0) {
            System.out.println("The engine started");
        } else {
            System.out.println("No fuel");
            engineOff();
        }
    }

    public void engineOff() {
        System.out.println("The engine is off");
        isStarted = false;
    }

    public void startTheCar() {
        engineOn();
        isStarted = true;
    }

    public void goByCar() {
        if (!isStarted) {
            System.out.println("The car went");
        } else {
            engineOff();
        }
    }

    public void stopTheCar() {
        System.out.println("The car stopped");
        engineOff();
        mileage += range;
    }
}
