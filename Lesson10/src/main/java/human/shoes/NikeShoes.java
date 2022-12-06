package human.shoes;

public class NikeShoes implements IShoes {
    @Override
    public void putOn() {
        System.out.println("Надеть обувь Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять обувь Nike");
    }
}
