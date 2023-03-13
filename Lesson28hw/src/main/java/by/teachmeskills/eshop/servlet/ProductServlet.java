package by.teachmeskills.eshop.servlet;

import static by.teachmeskills.eshop.utils.Utils.isUserLogIn;

import by.teachmeskills.eshop.model.Product;
import by.teachmeskills.eshop.model.User;
import by.teachmeskills.eshop.service.ProductService;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {

    private ProductService productService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        productService = (ProductService) config.getServletContext().getAttribute("productService");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("username");
        if (isUserLogIn(user)) {
            int productId = Integer.parseInt(request.getParameter("productId"));
            Product product = productService.getProductById(productId);
            request.setAttribute("oneProduct", product);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("product.jsp");
            requestDispatcher.forward(request, response);
        } else {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("signin.jsp");
            requestDispatcher.forward(request, response);
        }
    }
}
