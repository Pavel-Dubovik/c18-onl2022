package by.teachmeskills.eshop.repository.impl;

import by.teachmeskills.eshop.model.Product;
import by.teachmeskills.eshop.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

import static by.teachmeskills.eshop.utils.ProductHelper.products;

public class StaticProductRepositoryImpl implements ProductRepository {

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Product> getProductsByCategoryId(int categoryId) {
        return products.stream()
                .filter(product -> product.getCategoryId() == categoryId)
                .collect(Collectors.toList());
    }
}
