package by.tms.utils;

import lombok.experimental.UtilityClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@UtilityClass
public class DbUtils {
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/students_db";
    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Exception " + e.getMessage());
        }
        return connection;
    }

}
