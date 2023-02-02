package by.tms.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static by.tms.utils.Calculator.*;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        try {
            Double number1 = getValueFromParameter(req, "number1");
            Double number2 = getValueFromParameter(req, "number2");
            String operation = req.getParameter("operation");
            Double result = getResultOfOperation(number1, number2, operation);
            print(resp, "Результат операции " + operation + "=" + result);
        } catch (NumberFormatException exception) {
            print(resp, "Не верный формат значений");
        } catch (IllegalStateException exception) {
            print(resp, "Не верный формат значений");
        } catch (IllegalArgumentException exception) {
            print(resp, exception.getMessage());
        }
    }

    private Double getValueFromParameter(HttpServletRequest req, String parameter) {
        String parameterValue = req.getParameter(parameter);
        if (parameterValue == null) {
            throw new IllegalArgumentException(parameter + "не задан");
        }
        return Double.valueOf(parameterValue);
    }

    private Double getResultOfOperation(Double number1, Double number2, String operation) {
        return switch (operation) {
            case "sum" -> sum(number1, number2);
            case "mul" -> multiply(number1, number2);
            case "div" -> divide(number1, number2);
            case "sub" -> subtraction(number1, number2);
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        };
    }

    private void print(HttpServletResponse resp, String message) throws IOException {
        PrintWriter printWriter = resp.getWriter();
        printWriter.write(message);
    }
}
