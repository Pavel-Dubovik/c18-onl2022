package by.tms.myshop.controllers;

import by.tms.myshop.model.PagesPath;
import by.tms.myshop.model.User;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

import static by.tms.myshop.model.PagesPath.CART_PAGE_PATH;
import static by.tms.myshop.model.PagesPath.SIGN_IN_PAGE_PATH;
import static by.tms.myshop.utils.Constants.CART_COMMAND_GET;
import static by.tms.myshop.utils.Utils.isUserLogIn;

@Controller(CART_COMMAND_GET)
public class CartControllerDoGet implements BaseCommandController {
    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        User user = (User) request.getSession().getAttribute("user");
        if (isUserLogIn(user)) {
            return CART_PAGE_PATH;
        } else {
            return SIGN_IN_PAGE_PATH;
        }
    }
}