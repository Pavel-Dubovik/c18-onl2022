package by.teachmeskills.eshop.service.impl;

import by.teachmeskills.eshop.model.Category;
import by.teachmeskills.eshop.model.Inject;
import by.teachmeskills.eshop.repository.CategoryRepository;
import by.teachmeskills.eshop.service.CategoryService;
import lombok.Setter;
import java.util.List;

@Setter
public class CategoryServiceImpl implements CategoryService {

    @Inject
    private CategoryRepository categoryRepository;

    public List<Category> getCategories() {
        return categoryRepository.getCategories();
    }

    public Category getCategoryById(int id) {
        return categoryRepository.getCategory(id);
    }
}
