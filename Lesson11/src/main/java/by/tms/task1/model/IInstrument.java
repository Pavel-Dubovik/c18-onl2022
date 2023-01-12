package by.tms.task1.model;

public interface IInstrument {
    String KEY = "До мажор";

    void play();

    enum Type {
        GUITAR, DRUM, PIPE
    }
}
