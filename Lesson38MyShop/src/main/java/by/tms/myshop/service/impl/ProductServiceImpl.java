package by.tms.myshop.service.impl;

import by.tms.myshop.model.Product;
import by.tms.myshop.repository.impl.JdbcProductRepositoryImpl;
import by.tms.myshop.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private JdbcProductRepositoryImpl jdbcProductRepository;

    @Override
    public List<Product> getProducts() {
        return jdbcProductRepository.getProducts();
    }

    @Override
    public List<Product> getProductsByCategoryId(int id) {
        return jdbcProductRepository.getProductsByCategoryId(id);
    }

    @Override
    public Product getProductById(int id) {
        return jdbcProductRepository.getProductById(id);
    }
}