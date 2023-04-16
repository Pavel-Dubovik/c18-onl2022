package by.tms.myshop.repository.impl;

import by.tms.myshop.model.Category;
import by.tms.myshop.repository.CategoryRepository;
import by.tms.myshop.repository.utils.ConnectionWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class JdbcCategoryRepositoryImpl implements CategoryRepository {

    public static final String SELECT_ALL_CATEGORIES_QUERY = "select id, name, imagename from categories";

    @Override
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        try (ConnectionWrapper connectionWrapper = CONNECTION_POOL.getConnectionWrapper();
             Statement statement = connectionWrapper.getConnection().createStatement()) {

            ResultSet rs = statement.executeQuery(SELECT_ALL_CATEGORIES_QUERY);
            while (rs.next()) {
                Category category = Category.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .imageName(rs.getString("imageName"))
                        .build();
                categories.add(category);
            }

        } catch (Exception e) {
            log.error("Unexpected error", e);
        }
        return categories;
    }
}