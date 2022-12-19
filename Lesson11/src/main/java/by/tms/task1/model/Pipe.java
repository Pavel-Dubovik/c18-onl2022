package by.tms.task1.model;

import lombok.Getter;

@Getter
public class Pipe implements IInstrument {
    private int diameter;

    public Pipe(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.printf("Играет труба диаметром %d см.", getDiameter());
    }
}
