package by.tms.myshop.listener;

import by.tms.myshop.config.MyShopConfig;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@WebListener
public class InitializationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyShopConfig.class);
        sce.getServletContext().setAttribute("appContext", applicationContext);
    }
}