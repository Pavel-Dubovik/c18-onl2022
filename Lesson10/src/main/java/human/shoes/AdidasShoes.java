package human.shoes;

public class AdidasShoes implements IShoes {
    @Override
    public void putOn() {
        System.out.println("Надеть обувь Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять обувь Adidas");
    }
}
