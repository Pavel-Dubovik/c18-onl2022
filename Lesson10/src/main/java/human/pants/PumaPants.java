package human.pants;

public class PumaPants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Надеть штаны Puma");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять штаны Puma");
    }
}
