package itacademy.project.service;

import itacademy.project.entity.User;
import itacademy.project.model.TeacherModel;

import java.util.List;

public interface NewTeacherService {
    List<User> getAllTeachers();
    User save(TeacherModel teacherModel);
    User getTeacherById(Long id);
    User deleteTeacherById(Long id);
}
