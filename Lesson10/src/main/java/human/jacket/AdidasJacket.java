package human.jacket;

public class AdidasJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Надеть кофту Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять кофту Adidas");
    }
}
