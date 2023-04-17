package by.teachmeskills.eshop.service;

import by.teachmeskills.eshop.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Product getProductById(int id);

    List<Product> getProductsByCategoryId(int categoryId);
}