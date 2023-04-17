package by.teachmeskills.eshop.controllers;

import by.teachmeskills.eshop.model.Inject;
import by.teachmeskills.eshop.model.PagesPath;
import by.teachmeskills.eshop.model.Product;
import by.teachmeskills.eshop.model.User;
import by.teachmeskills.eshop.service.ProductService;
import lombok.Setter;

import javax.servlet.http.HttpServletRequest;

import static by.teachmeskills.eshop.model.PagesPath.PRODUCT_PAGE_PATH;
import static by.teachmeskills.eshop.model.PagesPath.SIGN_IN_PAGE_PATH;
import static by.teachmeskills.eshop.utils.Utils.isUserLogIn;

@Setter
public class ProductController implements BaseCommandController {

    @Inject
    private ProductService productService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        User user = (User) request.getSession().getAttribute("user");
        if (isUserLogIn(user)) {
            int productId = Integer.parseInt(request.getParameter("productId"));
            Product product = productService.getProductById(productId);
            request.setAttribute("oneProduct", product);
            return PRODUCT_PAGE_PATH;
        } else {
            return SIGN_IN_PAGE_PATH;
        }
    }
}