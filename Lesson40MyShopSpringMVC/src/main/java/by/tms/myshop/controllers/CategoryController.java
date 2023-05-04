package by.tms.myshop.controllers;

import by.tms.myshop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@Controller
public class CategoryController {

    private final ProductService productService;

    @GetMapping("/{id}")
    public ModelAndView openCategoryPage(@PathVariable int id) {
        return productService.getProductsByCategoryId(id);
    }
}