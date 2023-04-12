package by.tms.myshop.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Product {

    private int id;
    private String name;
    private String description;
    private BigDecimal price;
    private String imageName;
    private int categoryId;
}