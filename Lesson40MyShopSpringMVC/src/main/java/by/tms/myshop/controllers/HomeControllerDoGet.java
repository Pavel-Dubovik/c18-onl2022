package by.tms.myshop.controllers;

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
import static by.tms.myshop.utils.Constants.HOME_COMMAND_GET;
import static by.tms.myshop.utils.Utils.isUserLogIn;

@RequiredArgsConstructor
@Controller(HOME_COMMAND_GET)
public class HomeControllerDoGet implements BaseCommandController {

    private final CategoryService categoryService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        User user = (User) request.getSession().getAttribute("user");
        if (isUserLogIn(user)) {
            List<Category> categories = categoryService.getCategories();
            request.setAttribute("categories", categories);
            return HOME_PAGE_PATH;
        } else {
            return SIGN_IN_PAGE_PATH;
        }
    }
}