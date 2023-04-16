package by.tms.myshop.service.impl;

import by.tms.myshop.model.Product;
import by.tms.myshop.repository.impl.JdbcProductRepositoryImpl;
import by.tms.myshop.service.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    @Qualifier("jdbcProductRepositoryImpl")
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