package itacademy.project.service;

import itacademy.project.entity.SubjectTimeTable;
import itacademy.project.model.SubjectTTModel;

import java.util.List;

public interface SubjectTTService {
    SubjectTimeTable save(SubjectTTModel subjectTTModel);
    SubjectTimeTable deleteSubjectTTById(Long id);
    SubjectTimeTable getSubjectTTById(Long id);
    List<SubjectTimeTable> getAllSubjectTT();
}
