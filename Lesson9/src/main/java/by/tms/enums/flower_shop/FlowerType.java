package by.tms.enums.flower_shop;

import lombok.Getter;

@Getter

public enum FlowerType {
    ROSE(15), LILY(7), ASTER(5), GERBERA(5), TULIP(8), CARNATION(11);

    private int cost;


    FlowerType(int cost) {
        this.cost = cost;
    }
}
