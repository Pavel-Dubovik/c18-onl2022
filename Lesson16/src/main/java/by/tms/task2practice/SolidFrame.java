package by.tms.task2practice;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class SolidFrame extends Frame {
    private String serialNumber;

    public SolidFrame(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
