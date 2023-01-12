package by.tms.hw18.task1.model;

import by.tms.hw18.task1.service.CarIsNotReadyException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Car {
    private String carBrand;
    private double maxSpeed;
    private double price;

    public void startCar() throws CarIsNotReadyException {
        int number = (int) (Math.random() * 21);
        if (number % 2 == 0) {
            throw new CarIsNotReadyException("Car is not ready");
        } else {
            System.out.println("Car " + getCarBrand() + " started");
        }
    }

}
