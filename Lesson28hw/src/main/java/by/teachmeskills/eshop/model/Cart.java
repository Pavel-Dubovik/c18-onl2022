package by.teachmeskills.eshop.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cart {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product myProduct) {
        products.add(myProduct);
    }

    public void deleteProduct(Product myProduct) {
        products.remove(myProduct);
    }
}
