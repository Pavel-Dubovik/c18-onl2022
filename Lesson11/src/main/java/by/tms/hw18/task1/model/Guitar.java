package by.tms.hw18.task1.model;

import lombok.Getter;

@Getter
public class Guitar implements IInstrument {
    private int strings;

    public Guitar(int strings) {
        this.strings = strings;
    }

    @Override
    public void play() {
        System.out.printf("Играет гитара с %d струнами", getStrings());
    }
}
