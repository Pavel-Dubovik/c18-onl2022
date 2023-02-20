package by.tms.listener;

import by.tms.repository.JdbcStudentRepository;
import by.tms.repository.StudentRepository;
import by.tms.service.StudentService;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebListener
public class InitializationContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String driver = sce.getServletContext().getInitParameter("db_driver");
        String username = sce.getServletContext().getInitParameter("db_username");
        String password = sce.getServletContext().getInitParameter("db_password");
        String url = sce.getServletContext().getInitParameter("db_url");

        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, username, password);
            StudentRepository repository = new JdbcStudentRepository(connection);
            StudentService userService = new StudentService(repository);
            sce.getServletContext().setAttribute("userService", userService);
            sce.getServletContext().setAttribute("connection", connection);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try {
            final Connection connection = (Connection) sce.getServletContext().getAttribute("connection");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
