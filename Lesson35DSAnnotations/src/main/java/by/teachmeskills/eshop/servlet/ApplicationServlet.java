package by.teachmeskills.eshop.servlet;

import by.teachmeskills.eshop.controllers.BaseCommandController;
import by.teachmeskills.eshop.exceptions.ValidationException;
import by.teachmeskills.eshop.model.Command;
import by.teachmeskills.eshop.model.PagesPath;
import by.teachmeskills.eshop.utils.CommandControllerFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.teachmeskills.eshop.model.RequestParam.COMMAND;

@WebServlet("/eshop")
public class ApplicationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String commandKey = request.getParameter(COMMAND.getValue());
        if (commandKey == null || commandKey.isEmpty()) {
            commandKey = PagesPath.SIGN_IN_PAGE_PATH.getPath();
        }
        try {
            BaseCommandController baseController = CommandControllerFactory.defineCommand(Command.fromString(commandKey));
            PagesPath pagesPath = baseController.execute(request);
            RequestDispatcher dispatcher = request.getRequestDispatcher(pagesPath.getPath());
            dispatcher.forward(request, response);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            request.getRequestDispatcher(PagesPath.SIGN_IN_PAGE_PATH.getPath()).forward(request, response);
        }
    }
}