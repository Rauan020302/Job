package itacademy.project.service;

import itacademy.project.entity.Teacher;
import itacademy.project.model.TeacherModel;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();
    Teacher save(TeacherModel teacherModel);
    Teacher getTeacherById(Long id);
    Teacher deleteTeacherById(Long id);
}
