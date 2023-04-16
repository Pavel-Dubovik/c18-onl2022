package by.tms.myshop.repository.utils;

import java.sql.Connection;

public class ConnectionWrapper implements AutoCloseable {

    private final Connection connection;
    private final ConnectionPool connectionPool;

    public ConnectionWrapper(Connection connection, ConnectionPool connectionPool) {
        this.connection = connection;
        this.connectionPool = connectionPool;
    }

    public Connection getConnection() {
        return connection;
    }

    @Override
    public void close() throws Exception {
        connectionPool.closeConnection(this);
    }
}