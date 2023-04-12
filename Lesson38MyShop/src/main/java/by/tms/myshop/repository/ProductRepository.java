package by.tms.myshop.repository;

import by.tms.myshop.model.Product;

import java.util.List;

public interface ProductRepository extends BaseRepository {

    List<Product> getProducts();

    List<Product> getProductsByCategoryId();

    Product getProductById();
}