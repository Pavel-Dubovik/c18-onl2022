package human.jacket;

public class NikeJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Надеть кофту Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять кофту Nike");
    }
}
