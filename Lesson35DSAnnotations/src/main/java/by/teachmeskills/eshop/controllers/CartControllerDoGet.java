package by.teachmeskills.eshop.controllers;

import by.teachmeskills.eshop.model.PagesPath;
import by.teachmeskills.eshop.model.User;

import javax.servlet.http.HttpServletRequest;

import static by.teachmeskills.eshop.model.PagesPath.CART_PAGE_PATH;
import static by.teachmeskills.eshop.model.PagesPath.SIGN_IN_PAGE_PATH;
import static by.teachmeskills.eshop.utils.Utils.isUserLogIn;

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