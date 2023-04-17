package by.teachmeskills.eshop.controllers;

import by.teachmeskills.eshop.model.Inject;
import by.teachmeskills.eshop.model.PagesPath;
import by.teachmeskills.eshop.model.Product;
import by.teachmeskills.eshop.model.User;
import by.teachmeskills.eshop.service.ProductService;
import lombok.Setter;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static by.teachmeskills.eshop.model.PagesPath.CATEGORY_PAGE_PATH;
import static by.teachmeskills.eshop.model.PagesPath.SIGN_IN_PAGE_PATH;
import static by.teachmeskills.eshop.utils.Utils.isUserLogIn;

@Setter
public class CategoryController implements BaseCommandController {

    @Inject
    private ProductService productService;

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
