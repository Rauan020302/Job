package itacademy.project.service;

import itacademy.project.entity.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> getAllSubjects();
    Subject save (Subject subject);
}
