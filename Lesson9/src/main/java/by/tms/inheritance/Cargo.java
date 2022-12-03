package by.tms.inheritance;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Cargo extends Ground {
    private double loadCapacity;

    @Override
    public String getDescription() {
        return super.getDescription() +
                "\nГрузоподъемность - " + loadCapacity + " тонн";
    }

    public void checkLoadCapacity(double weight) {
        if (weight <= loadCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
