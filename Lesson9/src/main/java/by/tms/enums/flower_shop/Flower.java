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
    private static int count;

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
