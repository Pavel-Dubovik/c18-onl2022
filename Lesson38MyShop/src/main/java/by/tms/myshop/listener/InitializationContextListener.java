package by.tms.myshop.listener;

import by.tms.myshop.config.MyShopConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitializationContextListener implements ServletContextListener {

//    @Resource
//    private ConnectionPool connectionPool;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyShopConfig.class);
        sce.getServletContext().setAttribute("appContext", applicationContext);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
//        connectionPool.closeAllConnection();
    }
}