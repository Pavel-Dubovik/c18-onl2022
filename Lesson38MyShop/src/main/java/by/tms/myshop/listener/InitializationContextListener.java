package by.tms.myshop.listener;

import by.tms.myshop.repository.utils.ConnectionPool;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitializationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ConnectionPool.getInstance().closeAllConnection();
    }
}