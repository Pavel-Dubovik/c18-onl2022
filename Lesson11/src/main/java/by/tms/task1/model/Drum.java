package by.tms.task1.model;

import lombok.Getter;

@Getter
public class Drum implements IInstrument {
    private final int size = 50;

    @Override
    public void play() {
        System.out.printf("Играет барабан диаметром %d см.", getSize());
    }
}
