package by.tms.myshop.repository.impl;

import by.tms.myshop.model.Category;
import by.tms.myshop.repository.CategoryRepository;
import by.tms.myshop.repository.utils.ConnectionWrapper;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcCategoryRepositoryImpl implements CategoryRepository {

    @Override
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        try (ConnectionWrapper connectionWrapper = CONNECTION_POOL.getConnectionWrapper();
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
}