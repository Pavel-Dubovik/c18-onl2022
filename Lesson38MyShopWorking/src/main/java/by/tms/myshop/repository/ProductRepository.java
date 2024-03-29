package by.tms.myshop.repository;

import by.tms.myshop.model.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getProducts();

    List<Product> getProductsByCategoryId(int id);

    Product getProductById(int id);
}