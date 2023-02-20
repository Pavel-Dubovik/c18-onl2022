package by.tms.repository;

import by.tms.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findStudent();

    void addStudent(Student student);

    void deleteStudent(Integer id);
}
