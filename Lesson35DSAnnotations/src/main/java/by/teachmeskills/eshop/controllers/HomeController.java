package by.teachmeskills.eshop.controllers;

import by.teachmeskills.eshop.model.Cart;
import by.teachmeskills.eshop.model.Category;
import by.teachmeskills.eshop.model.Inject;
import by.teachmeskills.eshop.model.PagesPath;
import by.teachmeskills.eshop.model.User;
import by.teachmeskills.eshop.service.CategoryService;
import lombok.Setter;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static by.teachmeskills.eshop.model.PagesPath.HOME_PAGE_PATH;
import static by.teachmeskills.eshop.model.PagesPath.SIGN_IN_PAGE_PATH;
import static by.teachmeskills.eshop.utils.HttpRequestParamValidator.validateParamNotNull;
import static by.teachmeskills.eshop.utils.Utils.isUserLogIn;

@Setter
public class HomeController implements BaseCommandController {
    @Inject
    private CategoryService categoryService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        String login = request.getParameter("username");
        String pass = request.getParameter("password");
        validateParamNotNull(login);
        validateParamNotNull(pass);
        User user = new User(login, pass);
        Cart cart = new Cart();
        request.getSession().setAttribute("cart", cart);
        request.getSession().setAttribute("user", user);
        return checkReceivedUser(user,request);
    }

    private PagesPath checkReceivedUser(User user, HttpServletRequest request) {
        if (isUserLogIn(user)) {
            List<Category> categories = categoryService.getCategories();
            request.setAttribute("categories", categories);
            return HOME_PAGE_PATH;
        } else {
            return SIGN_IN_PAGE_PATH;
        }
    }
}