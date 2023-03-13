package by.teachmeskills.eshop.model;

import java.util.List;

import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@Builder
@AllArgsConstructor
public class Category {

    private int id;
    private String name;
    private String imageName;
    private List<Product> productList;

    public Category(int id, String name, String imageName) {
        this.id = id;
        this.name = name;
        this.imageName = imageName;
    }
}
