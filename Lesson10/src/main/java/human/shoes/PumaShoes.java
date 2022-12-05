package human.shoes;

public class PumaShoes implements IShoes {
    @Override
    public void putOn() {
        System.out.println("Надеть обувь Puma");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять обувь Puma");
    }
}
