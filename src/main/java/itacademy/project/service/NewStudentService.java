package itacademy.project.service;

import itacademy.project.entity.User;
import itacademy.project.model.StudentModel;

import java.util.List;

public interface NewStudentService {
    List<User> getAllStudents();
    User save(StudentModel studentModel);
    User getStudentById(Long id);
    User deleteStudentById(Long id);
    List<User> findAllByCabinet_Id(Long id);

}
