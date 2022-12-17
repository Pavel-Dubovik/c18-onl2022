package by.tms.task1.model;

import lombok.Getter;

@Getter
public class Pipe implements IInstrument {
    private final int diameter = 10;

    @Override
    public void play() {
        System.out.printf("Играет труба диаметром %d см.", getDiameter());
    }
}
