package by.teachmeskills.eshop.listener;

import by.teachmeskills.eshop.model.Command;
import by.teachmeskills.eshop.repository.utils.ConnectionPool;
import by.teachmeskills.eshop.utils.CommandControllerFactory;
import lombok.SneakyThrows;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitializationContextListener implements ServletContextListener {

    @Override
    @SneakyThrows
    public void contextInitialized(ServletContextEvent sce) {

        for (Command command : Command.values()) {
            CommandControllerFactory.defineCommand(command);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ConnectionPool.getInstance().closeAllConnection();
    }
}