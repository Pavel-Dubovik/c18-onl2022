package by.teachmeskills.eshop.repository.impl;

import by.teachmeskills.eshop.model.Category;
import by.teachmeskills.eshop.repository.CategoryRepository;
import by.teachmeskills.eshop.repository.utils.ConnectionPool;
import by.teachmeskills.eshop.repository.utils.ConnectionWrapper;
import lombok.AllArgsConstructor;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class JdbcCategoryRepositoryImpl implements CategoryRepository {

    private ConnectionPool connectionPool;

    @Override
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        try (ConnectionWrapper connectionWrapper = connectionPool.getConnectionWrapper();
             Statement statement = connectionWrapper.getConnection().createStatement()) {
            String sql = "select * from categories";
            try (ResultSet rs = statement.executeQuery(sql)) {
                while (rs.next()) {
                    Category category = Category.builder()
                            .id(rs.getInt("id"))
                            .name(rs.getString("name"))
                            .imageName(rs.getString("imageName"))
                            .build();
                    categories.add(category);
                }
            }
        } catch (Exception e) {
            System.out.println("Unexpected error " + e.getMessage());

        }
        return categories;
    }

    @Override
    public Category getCategory(int id) {
        return null;
    }
}