package by.teachmeskills.eshop.repository;

import by.teachmeskills.eshop.model.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getProducts();

    Product getProductById(int id);

    List<Product> getProductsByCategoryId(int categoryId);
}
