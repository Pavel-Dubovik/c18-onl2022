package by.tms.inheritance;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder

public class Military extends Air {
    private boolean ejectionSystemAvailability;
    private int numberOfMissiles;

    @Override
    public String getDescription() {
        return super.getDescription() +
                "\nНаличие системы катапультирования - " + ejectionSystemAvailability +
                "\nКоличество ракет на борту - " + numberOfMissiles;
    }

    public void takeShot() {
        if (numberOfMissiles > 0) {
            System.out.println("Ракета пошла...");
            numberOfMissiles--;
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void makeEjection() {
        if (ejectionSystemAvailability) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет системы катапультирования)");
        }
    }

}
