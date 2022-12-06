package human.pants;

public class AdidasPants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Надеть штаны Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять штаны Adidas");
    }
}
