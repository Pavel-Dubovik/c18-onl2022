package by.teachmeskills.eshop.service;

import by.teachmeskills.eshop.model.Category;

import java.util.List;

public interface CategoryServiceAware {

    List<Category> getCategories();

    Category getCategoryById(int id);

    Category getCategoryByName(String name);
}
