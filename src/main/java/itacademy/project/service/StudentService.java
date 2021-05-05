package itacademy.project.service;

import itacademy.project.entity.Student;
import itacademy.project.model.StudentModel;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student save(StudentModel studentModel);
    Student getStudentById(Long id);
    Student deleteStudentById(Long id);
}
