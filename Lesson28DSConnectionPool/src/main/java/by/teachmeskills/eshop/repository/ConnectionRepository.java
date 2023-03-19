package by.teachmeskills.eshop.repository;

import by.teachmeskills.eshop.repository.utils.ConnectionPool;
import by.teachmeskills.eshop.repository.utils.ConnectionWrapper;

public interface ConnectionRepository {
    default ConnectionWrapper getConnectionWrapper() throws Exception {
        return ConnectionPool.getInstance().getConnectionWrapper();
    }
}
