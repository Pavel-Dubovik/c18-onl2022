package by.tms.task2practice;

import lombok.ToString;

@ToString
public class ClothMaterial extends Material {
    private String name;

    public ClothMaterial(String name) {
        this.name = name;
    }
}
