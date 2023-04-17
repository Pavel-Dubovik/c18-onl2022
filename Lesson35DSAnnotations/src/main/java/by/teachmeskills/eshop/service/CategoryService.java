package by.teachmeskills.eshop.service;

import by.teachmeskills.eshop.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getCategories();

    Category getCategoryById(int id);
}
