package by.teachmeskills.eshop.repository;

import by.teachmeskills.eshop.repository.utils.ConnectionPool;

public interface BaseRepository {
    /*default ConnectionWrapper getConnectionWrapper() throws Exception {
        return ConnectionPool.getInstance().getConnectionWrapper();
    }*/
    ConnectionPool CONNECTION_POOL = ConnectionPool.getInstance();
}
