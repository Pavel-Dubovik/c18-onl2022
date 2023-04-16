package by.tms.myshop.controllers;

import by.tms.myshop.model.PagesPath;
import by.tms.myshop.model.Product;
import by.tms.myshop.model.User;
import by.tms.myshop.service.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import static by.tms.myshop.model.PagesPath.PRODUCT_PAGE_PATH;
import static by.tms.myshop.model.PagesPath.SIGN_IN_PAGE_PATH;
import static by.tms.myshop.utils.Constants.PRODUCT_COMMAND;
import static by.tms.myshop.utils.Utils.isUserLogIn;

@Controller(PRODUCT_COMMAND)
public class ProductController implements BaseCommandController {

    @Resource
    @Qualifier("productServiceImpl")
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