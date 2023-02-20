package by.tms.repository;

import by.tms.model.City;
import by.tms.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcStudentRepository implements StudentRepository {
    private final Connection connection;
    public static final String SELECT_ALL_STUDENTS_QUERY = "select * from students left join city on city.id = students.city_id";
    public static final String INSERT_STUDENT_QUERY = "insert into students(name, surname, course, city_id) VALUES(?, ?, ?, ?)";
    public static final String INSERT_STUDENT_CITY_QUERY = "insert into city(city_name) VALUES(?) RETURNING id";
    public static final String DELETE_STUDENT_QUERY = "delete from students where id = ?";


    public JdbcStudentRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Student> findStudent() {
        List<Student> studentsWithCities = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_STUDENTS_QUERY);
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

    @Override
    public void addStudent(Student student) {
        try {
            PreparedStatement statement = connection.prepareStatement(INSERT_STUDENT_CITY_QUERY);
            statement.setString(1, student.getCity().getName());
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");

                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_QUERY);
                preparedStatement.setString(1, student.getName());
                preparedStatement.setString(2, student.getSurname());
                preparedStatement.setString(3, student.getCourse());
                preparedStatement.setInt(4, id);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteStudent(Integer id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_STUDENT_QUERY);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println("Exception " + e.getMessage());
        }
    }
}
