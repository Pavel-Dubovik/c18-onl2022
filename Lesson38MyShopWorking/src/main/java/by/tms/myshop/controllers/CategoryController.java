package by.tms.myshop.controllers;

import by.tms.myshop.model.PagesPath;
import by.tms.myshop.model.Product;
import by.tms.myshop.model.User;
import by.tms.myshop.service.ProductService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

import static by.tms.myshop.model.PagesPath.CATEGORY_PAGE_PATH;
import static by.tms.myshop.model.PagesPath.SIGN_IN_PAGE_PATH;
import static by.tms.myshop.utils.Constants.CATEGORY_COMMAND;
import static by.tms.myshop.utils.Utils.isUserLogIn;

@RequiredArgsConstructor
@Controller(CATEGORY_COMMAND)
public class CategoryController implements BaseCommandController {

    private final ProductService productService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        User user = (User) request.getSession().getAttribute("user");
        if (isUserLogIn(user)) {
            int categoryId = Integer.parseInt(request.getParameter("categoryId"));
            String nameCategory = request.getParameter("nameCategory");
            List<Product> categoryProducts = productService.getProductsByCategoryId(categoryId);
            request.setAttribute("products", categoryProducts);
            request.setAttribute("nameCategory", nameCategory);
            return CATEGORY_PAGE_PATH;
        } else {
            return SIGN_IN_PAGE_PATH;
        }
    }
}