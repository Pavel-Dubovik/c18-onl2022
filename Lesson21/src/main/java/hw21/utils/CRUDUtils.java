package hw21.utils;

import hw21.model.Student;
import lombok.experimental.UtilityClass;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class CRUDUtils {
    public static final String INSERT_STUDENT_QUERY = "insert into students(name, surname, course) VALUES(?, ?, ?)";
    public static final String SELECT_ALL_STUDENTS_QUERY = "select * from students";
    public static final String UPDATE_STUDENT_QUERY = "update students set course = ? where id = ?";
    public static final String DELETE_STUDENT_QUERY = "delete from students where id = ?";
    public static final String INSERT_CITY_QUERY = "insert into cities(student_id, city) values(?, ?)";
    public static final String SELECT_ALL_STUDENTS_WITH_CITY_QUERY = "select * from students, cities where cities.student_id = students.id";


    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_STUDENTS_QUERY);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String course = resultSet.getString("course");
                students.add(new Student(id, name, surname, course));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return students;
    }

    public static List<Student> saveStudent(Student student) {
        List<Student> updateStudents = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection();) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_QUERY);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setString(3, student.getCourse());
            preparedStatement.executeUpdate();

            updateStudents = getAllStudents();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updateStudents;
    }

    public static List<Student> updateStudent(int studentId, String course) {
        List<Student> updateStudents = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection();) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_STUDENT_QUERY);
            preparedStatement.setString(1, course);
            preparedStatement.setInt(2, studentId);
            preparedStatement.executeUpdate();

            updateStudents = getAllStudents();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updateStudents;
    }

    public static List<Student> deleteStudent(int studentId) {
        List<Student> updateStudents = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection();) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_STUDENT_QUERY);
            preparedStatement.setInt(1, studentId);
            preparedStatement.execute();

            updateStudents = getAllStudents();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updateStudents;
    }

    public static void saveCity(String city, int studentId) {

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CITY_QUERY);
            preparedStatement.setInt(1, studentId);
            preparedStatement.setString(2, city);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

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
                String city = resultSet.getString("city");
                studentsWithCities.add(new Student(id, name, surname, course, city));


            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return studentsWithCities;
    }
}
