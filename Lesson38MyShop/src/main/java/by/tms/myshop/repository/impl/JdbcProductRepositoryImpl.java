package by.tms.myshop.repository.impl;

import by.tms.myshop.model.Product;
import by.tms.myshop.repository.ProductRepository;

import java.util.List;

public class JdbcProductRepositoryImpl implements ProductRepository {

    private static final String SELECT_ALL_PRODUCTS_QUERY = "select "

    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public List<Product> getProductsByCategoryId() {
        return null;
    }

    @Override
    public Product getProductById() {
        return null;
    }
}
