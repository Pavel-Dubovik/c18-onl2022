package by.tms.myshop.controllers;

import by.tms.myshop.model.Cart;
import by.tms.myshop.model.PagesPath;
import by.tms.myshop.model.Product;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;

import static by.tms.myshop.model.PagesPath.CART_CONTROLLER_PATH;
import static by.tms.myshop.utils.Constants.CART_COMMAND_POST;

@Controller(CART_COMMAND_POST)
public class CartControllerDoPost implements BaseCommandController {

    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession(false);
        Cart cart = (Cart) session.getAttribute("cart");
        String priceParameter = request.getParameter("price");
        Product product = Product.builder()
                .id(Integer.parseInt(request.getParameter("id")))
                .imageName(request.getParameter("imageName"))
                .name(request.getParameter("name"))
                .description(request.getParameter("description"))
                .price(new BigDecimal(priceParameter))
                .categoryId(Integer.parseInt(request.getParameter("categoryId")))
                .build();

        String action = request.getParameter("action");
        switch (action) {
            case "Buy" -> {
                cart.addProduct(product);
                session.setAttribute("myProducts", cart.getProducts());
                return CART_CONTROLLER_PATH;
            }
            case "Delete" -> {
                cart.deleteProduct(product);
                session.setAttribute("myProducts", cart.getProducts());
                return CART_CONTROLLER_PATH;
            }
            default -> {
                throw new IllegalArgumentException("Такой кнопки нет");
            }
        }
    }
}