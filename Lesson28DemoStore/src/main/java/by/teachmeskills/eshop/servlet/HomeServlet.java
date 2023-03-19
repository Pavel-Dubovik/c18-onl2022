package by.teachmeskills.eshop.servlet;

import by.teachmeskills.eshop.exceptions.ValidationException;
import by.teachmeskills.eshop.model.Cart;
import by.teachmeskills.eshop.model.Category;
import by.teachmeskills.eshop.model.User;
import by.teachmeskills.eshop.service.CategoryService;
import by.teachmeskills.eshop.service.impl.CategoryServiceImpl;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static by.teachmeskills.eshop.utils.HttpRequestParamValidator.validateParamNotNull;
import static by.teachmeskills.eshop.utils.ServletHelper.forwardToAddress;
import static by.teachmeskills.eshop.utils.Utils.isUserLogIn;

@WebServlet("/home")
@Slf4j
public class HomeServlet extends HttpServlet {

    private CategoryService categoryService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        categoryService = (CategoryServiceImpl) config.getServletContext().getAttribute("categoryService");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("user");
        checkReceivedUser(user, request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("username");
        String pass = request.getParameter("password");
        User user;
        Cart cart;
        try {
            validateParamNotNull(login);
            validateParamNotNull(pass);
            user = new User(login, pass);
            cart = new Cart();
            request.getSession().setAttribute("cart", cart);
            request.getSession().setAttribute("user", user);
            checkReceivedUser(user, request, response);
        } catch (ValidationException e) {
            log.error("Login and/or password not entered", e);
        }
    }

    private void checkReceivedUser(User user, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (isUserLogIn(user)) {
            List<Category> categories = categoryService.getCategories();
            request.setAttribute("categories", categories);
            forwardToAddress(request, response, "/home.jsp");
        } else {
            forwardToAddress(request, response, "/signin.jsp");
        }
    }
}