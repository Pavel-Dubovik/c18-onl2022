package by.tms.myshop.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Cart implements Serializable {

    private List<Product> products;

    public Cart() {
        if (products == null) {
            products = new ArrayList<>();
        }
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }
}