package by.tms.utils;

import by.tms.model.City;
import by.tms.model.Student;
import lombok.experimental.UtilityClass;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class CRUDUtils {
    public static final String SELECT_ALL_STUDENTS_WITH_CITY_QUERY = "select * from students left join city on city.city_id = students.id";

    public static List<Student> getAllStudentWithCities() {
        List<Student> studentsWithCities = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_STUDENTS_WITH_CITY_QUERY);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String course = resultSet.getString("course");
                int cityId = resultSet.getInt("city_id");
                String city = resultSet.getString("city_name");
                studentsWithCities.add(new Student(id, name, surname, course, new City(cityId, city)));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return studentsWithCities;
    }
}