import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String numberAsString1 = req.getParameter("number1");
        String operation = req.getParameter("operation");
        String numberAsString2 = req.getParameter("number2");

        Double number1 = Double.parseDouble(numberAsString1);
        Double number2 = Double.parseDouble(numberAsString2);

        String name = "solution";
        switch (operation) {
            case "sum" -> req.setAttribute(name, Calculator.sum(number1, number2));
            case "mul" -> req.setAttribute(name, Calculator.multiply(number1, number2));
            case "div" -> req.setAttribute(name, Calculator.divide(number1, number2));
            case "sub" -> req.setAttribute(name, Calculator.subtraction(number1, number2));
        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(req, resp);
    }
}
