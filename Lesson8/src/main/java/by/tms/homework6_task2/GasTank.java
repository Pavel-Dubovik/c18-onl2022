package by.tms.homework6_task2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class GasTank {
    private double totalVolume;
    private double currentVolume;

    public GasTank(double currentVolume) {
        this.currentVolume = currentVolume;
    }
}
