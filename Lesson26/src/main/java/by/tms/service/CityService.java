package by.tms.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CityService {

    private Connection connection;
    public static final String SELECT_CITY_QUERY = "select * from city where city_name = ?";
    public static final String SELECT_CITY_ID_BY_CITY_NAME = "select id from city where city_name = ?";
    public static final String INSERT_STUDENT_CITY_QUERY = "insert into city(city_name) VALUES(?)";

    public CityService(Connection connection) {
        this.connection = connection;
    }


    public boolean isThereACity(String cityName) {
        try {
            String name = null;
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CITY_QUERY);
            preparedStatement.setString(1, cityName);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                name = resultSet.getString("city_name");
            }
            if (!name.isEmpty()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return false;
    }

    public int getCityIdByName(String cityName) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CITY_ID_BY_CITY_NAME);
            preparedStatement.setString(1, cityName);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return resultSet.getInt("id");
            }
        } catch (SQLException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return -1;
    }

    public void addCity(String cityName) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_CITY_QUERY);
            preparedStatement.setString(1, cityName);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}