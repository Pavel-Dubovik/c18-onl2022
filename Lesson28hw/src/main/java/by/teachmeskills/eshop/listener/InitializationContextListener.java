package by.teachmeskills.eshop.listener;

import by.teachmeskills.eshop.repository.CategoryRepository;
import by.teachmeskills.eshop.repository.impl.JdbcCategoryRepositoryImpl;
import by.teachmeskills.eshop.repository.impl.ProductRepositoryImpl;
import by.teachmeskills.eshop.service.CategoryService;
import by.teachmeskills.eshop.service.ProductService;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitializationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String username = sce.getServletContext().getInitParameter("db_user");
        String password = sce.getServletContext().getInitParameter("db_password");
        String dbUrl = sce.getServletContext().getInitParameter("db_url");
        String dbDriver = sce.getServletContext().getInitParameter("db_driver");
        try {
            Class.forName(dbDriver);
            Connection connection = DriverManager.getConnection(dbUrl, username, password);

            ProductService productService = new ProductService(new ProductRepositoryImpl());
            sce.getServletContext().setAttribute("productService", productService);

            CategoryRepository jdbcCategoryRepository = new JdbcCategoryRepositoryImpl(connection);
            CategoryService categoryService = new CategoryService(jdbcCategoryRepository);
            sce.getServletContext().setAttribute("categoryService", categoryService);
        } catch (Exception e) {
            System.out.println("Unexpected error " + e.getMessage());
        }


    }

    /*private Connection getConnection(ServletContextEvent sce) {
        String username = sce.getServletContext().getInitParameter("db_user");
        String password = sce.getServletContext().getInitParameter("db_password");
        String dbUrl = sce.getServletContext().getInitParameter("db_url");
        String dbDriver = sce.getServletContext().getInitParameter("db_driver");
        try {
            Class.forName(dbDriver);
            return DriverManager.getConnection(dbUrl, username, password);
        } catch (Exception e) {
            System.out.println("Unexpected error " + e.getMessage());
        }
        return null;
    }*/
}
