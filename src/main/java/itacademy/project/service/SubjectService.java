package itacademy.project.service;

import itacademy.project.entity.Subject;
import itacademy.project.model.SubjectModel;

import java.util.List;

public interface SubjectService {
    List<Subject> getAllSubjects();
    Subject save (SubjectModel subjectModel);
    Subject getSubjectById(Long id);
    Subject deleteSubjectById(Long id);
}
