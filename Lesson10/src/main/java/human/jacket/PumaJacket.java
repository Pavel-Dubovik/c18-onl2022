package human.jacket;

public class PumaJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Надеть кофту Puma");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять кофту Puma");
    }
}
