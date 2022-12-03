package by.tms.enums.flower_shop;

public class FlowerMarket {
    public Flower[] getBouquet(FlowerType type1, FlowerType type2, FlowerType type3) {
        Flower fl1 = new Flower();
        fl1.setFlowerType(type1);
        Flower fl2 = new Flower();
        fl2.setFlowerType(type2);
        Flower fl3 = new Flower();
        fl3.setFlowerType(type3);
        Flower[] bouquet = new Flower[3];
        bouquet[0] = fl1;
        bouquet[1] = fl2;
        bouquet[2] = fl3;
        return bouquet;
    }
}
