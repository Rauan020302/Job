package itacademy.project.service;

import itacademy.project.entity.Subject;
import itacademy.project.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject save(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public Subject getSubjectById(Long id) {
        return subjectRepository.findById(id).orElse(null);
    }

    @Override
    public Subject deleteSubjectById(Long id) {
        Subject subject = getSubjectById(id);
        if (subject != null){
            subjectRepository.delete(subject);
            return subject;
        }
        return null;
    }
}
