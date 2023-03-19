package by.teachmeskills.eshop.utils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletHelper {

    public static void forwardToAddress(HttpServletRequest request, HttpServletResponse response, String address) throws ServletException, IOException {
        request.getServletContext().getRequestDispatcher(address).forward(request, response);
    }
}