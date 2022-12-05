package human.pants;

public class NikePants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Надеть штаны Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять штаны Nike");
    }
}
