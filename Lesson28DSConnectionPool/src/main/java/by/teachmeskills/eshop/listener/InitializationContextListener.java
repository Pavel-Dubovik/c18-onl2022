package by.teachmeskills.eshop.listener;

import by.teachmeskills.eshop.repository.CategoryRepository;
import by.teachmeskills.eshop.repository.impl.JdbcCategoryRepositoryImpl;
import by.teachmeskills.eshop.repository.impl.StaticProductRepositoryImpl;
import by.teachmeskills.eshop.repository.utils.ConnectionPool;
import by.teachmeskills.eshop.service.impl.CategoryServiceImpl;
import by.teachmeskills.eshop.service.impl.ProductServiceImpl;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitializationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        ProductServiceImpl productService = new ProductServiceImpl(new StaticProductRepositoryImpl());
        sce.getServletContext().setAttribute("productService", productService);

        CategoryRepository jdbcCategoryRepository = new JdbcCategoryRepositoryImpl(connectionPool);
        CategoryServiceImpl categoryService = new CategoryServiceImpl(jdbcCategoryRepository);
        sce.getServletContext().setAttribute("categoryService", categoryService);
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
