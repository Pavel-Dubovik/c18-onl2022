package by.tms.myshop.service.impl;

import by.tms.myshop.model.Category;
import by.tms.myshop.repository.CategoryRepository;
import by.tms.myshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    @Qualifier("jdbcCategoryRepositoryImpl")
    CategoryRepository categoryRepository;

    @Override
    public List<Category> getCategories() {
        return categoryRepository.getCategories();
    }
}