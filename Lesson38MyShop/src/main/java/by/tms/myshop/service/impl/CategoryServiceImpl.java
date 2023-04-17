package by.tms.myshop.service.impl;

import by.tms.myshop.model.Category;
import by.tms.myshop.repository.CategoryRepository;
import by.tms.myshop.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

    /*@Resource
    @Qualifier("jdbcCategoryRepositoryImpl")*/
    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> getCategories() {
        return categoryRepository.getCategories();
    }
}