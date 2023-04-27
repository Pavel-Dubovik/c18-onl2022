package by.tms.myshop.controllers;

import by.tms.myshop.model.PagesPath;
import by.tms.myshop.model.Product;
import by.tms.myshop.model.User;
import by.tms.myshop.service.ProductService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import static by.tms.myshop.model.PagesPath.PRODUCT_PAGE_PATH;
import static by.tms.myshop.model.PagesPath.SIGN_IN_PAGE_PATH;
import static by.tms.myshop.utils.Constants.PRODUCT_COMMAND;
import static by.tms.myshop.utils.Utils.isUserLogIn;

@RequiredArgsConstructor
@Controller(PRODUCT_COMMAND)
public class ProductController implements BaseCommandController {

    private final ProductService productService;

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