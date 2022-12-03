package by.tms.enums.flower_shop;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Flower {
    private String name;
    private FlowerType flowerType;

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    public Flower() {
    }


}
