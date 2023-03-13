package by.teachmeskills.eshop.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
public class Product {

    private int id;
    private String imageName;
    private String name;
    private String description;
    private BigDecimal price;
    private int categoryId;
}
