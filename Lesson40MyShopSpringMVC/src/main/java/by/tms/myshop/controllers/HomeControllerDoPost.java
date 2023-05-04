package by.tms.myshop.controllers;

import by.tms.myshop.model.Cart;
import by.tms.myshop.model.Category;
import by.tms.myshop.model.PagesPath;
import by.tms.myshop.model.User;
import by.tms.myshop.service.CategoryService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

import static by.tms.myshop.model.PagesPath.HOME_PAGE_PATH;
import static by.tms.myshop.model.PagesPath.SIGN_IN_PAGE_PATH;
import static by.tms.myshop.utils.HttpRequestParamValidator.validateParamNotNull;
import static by.tms.myshop.utils.Utils.isUserLogIn;

@RequiredArgsConstructor
@Controller
public class HomeControllerDoPost implements BaseCommandController {

    private final CategoryService categoryService;

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
        return checkReceivedUser(user, request);
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