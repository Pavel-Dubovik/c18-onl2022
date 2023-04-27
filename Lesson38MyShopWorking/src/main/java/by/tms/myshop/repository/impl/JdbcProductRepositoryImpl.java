package by.tms.myshop.repository.impl;

import by.tms.myshop.model.Product;
import by.tms.myshop.repository.ProductRepository;
import by.tms.myshop.repository.utils.ConnectionPool;
import by.tms.myshop.repository.utils.ConnectionWrapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Repository
public class JdbcProductRepositoryImpl implements ProductRepository {

    private final ConnectionPool connectionPool;

    private static final String SELECT_ALL_PRODUCTS_QUERY = "select id, name, description, price, image_path, category_id from products";
    private static final String SELECT_PRODUCTS_BY_CATEGORY_ID_QUERY = "select id, name, description, price, image_path, category_id from products where category_id = ?";
    private static final String SELECT_PRODUCT_BY_ID_QUERY = "select id, name, description, price, image_path, category_id from products where id = ?";

    @Override
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        try (ConnectionWrapper connectionWrapper = connectionPool.getConnectionWrapper();
             Statement statement = connectionWrapper.getConnection().createStatement()) {

            ResultSet resultSet = statement.executeQuery(SELECT_ALL_PRODUCTS_QUERY);
            while (resultSet.next()) {
                Product product = Product.builder()
                        .id(resultSet.getInt("id"))
                        .name(resultSet.getString("name"))
                        .description(resultSet.getString("description"))
                        .price(new BigDecimal(resultSet.getInt("price")))
                        .imageName(resultSet.getString("image_path"))
                        .categoryId(resultSet.getInt("category_id"))
                        .build();
                products.add(product);
            }
        } catch (Exception e) {
            log.error("Unexpected error", e);
        }
        return products;
    }

    @Override
    public List<Product> getProductsByCategoryId(int id) {
        List<Product> products = new ArrayList<>();
        try (ConnectionWrapper connectionWrapper = connectionPool.getConnectionWrapper();
             PreparedStatement statement = connectionWrapper.getConnection().prepareStatement(SELECT_PRODUCTS_BY_CATEGORY_ID_QUERY)) {

            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Product product = Product.builder()
                        .id(resultSet.getInt("id"))
                        .name(resultSet.getString("name"))
                        .description(resultSet.getString("description"))
                        .price(new BigDecimal(resultSet.getInt("price")))
                        .imageName(resultSet.getString("image_path"))
                        .categoryId(resultSet.getInt("category_id"))
                        .build();
                products.add(product);
            }
        } catch (Exception e) {
            log.error("Unexpected error", e);
        }
        return products;
    }

    @Override
    public Product getProductById(int id) {
        Product product = new Product();
        try (ConnectionWrapper connectionWrapper = connectionPool.getConnectionWrapper();
             PreparedStatement statement = connectionWrapper.getConnection().prepareStatement(SELECT_PRODUCT_BY_ID_QUERY)) {

            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                product = Product.builder()
                        .id(resultSet.getInt("id"))
                        .name(resultSet.getString("name"))
                        .description(resultSet.getString("description"))
                        .price(new BigDecimal(resultSet.getInt("price")))
                        .imageName(resultSet.getString("image_path"))
                        .categoryId(resultSet.getInt("category_id"))
                        .build();
            }
        } catch (Exception e) {
            log.error("Unexpected error", e);
        }
        return product;
    }
}