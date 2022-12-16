package by.tms.task1.model;

import lombok.Getter;

@Getter
public class Guitar implements IInstrument {
    private final int strings = 6;

    @Override
    public void play() {
        System.out.printf("Играет гитара с %d струнами", getStrings());
    }
}
