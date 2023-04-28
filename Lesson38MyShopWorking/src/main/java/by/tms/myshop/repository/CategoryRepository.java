package by.tms.myshop.repository;

import by.tms.myshop.model.Category;

import java.util.List;

public interface CategoryRepository {

    List<Category> getCategories();
}