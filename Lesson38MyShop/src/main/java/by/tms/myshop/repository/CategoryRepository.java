package by.tms.myshop.repository;

import by.tms.myshop.model.Category;

import java.util.List;

public interface CategoryRepository extends BaseRepository {

    List<Category> getCategories();
}