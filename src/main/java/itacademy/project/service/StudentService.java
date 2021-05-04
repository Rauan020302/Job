package itacademy.project.service;

import itacademy.project.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student save(Student student);
    Student getStudentById(Long id);
}
