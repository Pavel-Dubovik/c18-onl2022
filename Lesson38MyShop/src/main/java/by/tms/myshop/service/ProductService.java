package by.tms.myshop.service;

import by.tms.myshop.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    List<Product> getProductsByCategoryId(int id);

    Product getProductById(int id);
}