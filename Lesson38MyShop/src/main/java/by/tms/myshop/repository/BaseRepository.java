package by.tms.myshop.repository;

import by.tms.myshop.repository.utils.ConnectionPool;

public interface BaseRepository {

    ConnectionPool CONNECTION_POOL = ConnectionPool.getInstance();
}