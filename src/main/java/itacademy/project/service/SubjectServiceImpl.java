package itacademy.project.service;

import itacademy.project.entity.Subject;
import itacademy.project.entity.TimeTable;
import itacademy.project.model.SubjectModel;
import itacademy.project.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private TimeTableService timeTableService;
    @Override
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject save(SubjectModel subjectModel) {
        TimeTable timeTable = timeTableService.getTimeTableById(subjectModel.getTimeTable());
        if (timeTable == null)return null;
        Subject subject = Subject.builder()
                .name(subjectModel.getName())
                .timeTable(timeTable).build();
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
