package itacademy.project.service;

import itacademy.project.entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();
    Teacher save(Teacher teacher);
    Teacher getTeacherById(Long id);
}
