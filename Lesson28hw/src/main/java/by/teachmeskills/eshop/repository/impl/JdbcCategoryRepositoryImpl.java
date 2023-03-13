package by.teachmeskills.eshop.repository.impl;

import by.teachmeskills.eshop.model.Category;
import by.teachmeskills.eshop.repository.CategoryRepository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JdbcCategoryRepositoryImpl implements CategoryRepository {

    private final Connection connection;

    @Override
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String sql = "select * from categories";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Category category = Category.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .imageName(rs.getString("imageName"))
                        .build();
                categories.add(category);
            }
        } catch (SQLException e) {
            System.out.println("Unexpected error " + e.getMessage());
        }
        return categories;
    }

    @Override
    public Category getCategory(int id) {
        return null;
    }
}