package by.tms.enums.flower_shop;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Bouquet {
    private Flower[] flowers;

    public Bouquet(Flower[] flower) {
        this.flowers = flower;
    }

    public Flower[] getFlower() {
        return flowers;
    }

    // метод по вычислению стоимости
    public double calculateCostOfBouquet(Flower[] flowers) {
        double totalCost = 0;
        for (int i = 0; i < flowers.length; i++) {
            totalCost += flowers[i].getFlowerType().getCost();
        }
        return totalCost;
    }
}
