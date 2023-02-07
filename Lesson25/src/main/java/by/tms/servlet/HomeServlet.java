package by.tms.servlet;

import by.tms.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        HttpSession httpSession = request.getSession();
        Object log = httpSession.getAttribute("log");
        Object pass = httpSession.getAttribute("pass");

        User user = new User();
        if (user.getLogin().equals(log) && user.getPassword().equals(pass)) {
            response.sendRedirect("home.jsp");
        } else {
            response.sendRedirect("login.jsp");
        }
    }
}
