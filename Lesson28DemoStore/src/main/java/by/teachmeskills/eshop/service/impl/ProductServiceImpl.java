package by.teachmeskills.eshop.service.impl;

import by.teachmeskills.eshop.model.Product;
import by.teachmeskills.eshop.repository.ProductRepository;
import by.teachmeskills.eshop.service.ProductService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.getProducts();
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.getProductById(id);
    }

    @Override
    public List<Product> getProductsByCategoryId(int categoryId) {
        return productRepository.getProductsByCategoryId(categoryId);
    }
}