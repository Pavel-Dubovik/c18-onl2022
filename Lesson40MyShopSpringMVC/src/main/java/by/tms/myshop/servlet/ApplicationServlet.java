package by.tms.myshop.servlet;

import by.tms.myshop.model.PagesPath;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

import static by.tms.myshop.model.PagesPath.SIGN_IN_PAGE_PATH;
import static by.tms.myshop.model.RequestParam.COMMAND;

@Slf4j
@WebServlet("/my-shop")
public class ApplicationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String commandKey = request.getParameter(COMMAND.getValue());
        if (commandKey == null || commandKey.isEmpty()) {
            commandKey = SIGN_IN_PAGE_PATH.getPath();
        }
        try {
            AnnotationConfigApplicationContext context = (AnnotationConfigApplicationContext) request.getServletContext().getAttribute("appContext");
            BaseCommandController commandController = (BaseCommandController) context.getBean(commandKey);
            PagesPath pagesPath = commandController.execute(request);
            RequestDispatcher dispatcher = request.getRequestDispatcher(pagesPath.getPath());
            dispatcher.forward(request, response);
        } catch (Exception e) {
            log.error("Application context is empty", e);
            request.getRequestDispatcher(SIGN_IN_PAGE_PATH.getPath()).forward(request, response);
        }
    }
}