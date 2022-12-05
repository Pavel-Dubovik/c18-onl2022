package by.tms.enums.flower_shop;

public class FlowerMarket {
    private Bouquet bouquet;

    public Bouquet getBouquet(String... flowers) {
        Flower[] result = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            FlowerType flowerType = FlowerType.valueOf(flowers[i]);
            result[i] = new Flower(flowerType);
        }
        return new Bouquet(result);
    }
}
