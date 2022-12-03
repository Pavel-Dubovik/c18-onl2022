package by.tms.inheritance;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder

public class Air extends Transport {
    private double wingspan;
    private double minRunway;

    @Override
    public String getDescription() {
        return super.getDescription() +
                "\nРазмах крыльев - " + wingspan + " метров" +
                "\nМинимальная длина взлётно-посадочной полосы для взлёта - " + minRunway + " км";
    }

}
