package itacademy.project.service;

import itacademy.project.entity.Subject;
import itacademy.project.entity.SubjectTimeTable;
import itacademy.project.entity.TimeTable;
import itacademy.project.model.SubjectTTModel;
import itacademy.project.repository.SubjectTTRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubjectTTServiceImpl implements SubjectTTService {
    @Autowired
    private SubjectTTRepository subjectTTRepository;
    @Autowired
    private SubjectService subjectService;
    @Autowired
    private TimeTableService timeTableService;

    @Override
    public SubjectTimeTable save(SubjectTTModel subjectTTModel) {
        Subject subject = subjectService.getSubjectById(subjectTTModel.getSubjectId());
        TimeTable timeTable = timeTableService.getTimeTableById(subjectTTModel.getTimeTableId());
        SubjectTimeTable subjectTimeTable = SubjectTimeTable.builder()
                .subjects(subject)
                .timeTables(timeTable).build();

        return subjectTTRepository.save(subjectTimeTable);
    }

    @Override
    public SubjectTimeTable deleteSubjectTTById(Long id) {
        SubjectTimeTable subjectTimeTable = getSubjectTTById(id);
        if (subjectTimeTable != null){
            subjectTTRepository.delete(subjectTimeTable);
            return subjectTimeTable;
        }
        return null;
    }

    @Override
    public SubjectTimeTable getSubjectTTById(Long id) {
        return subjectTTRepository.findById(id).orElse(null);
    }

    @Override
    public List<SubjectTimeTable> getAllSubjectTT() {
        return subjectTTRepository.findAll();
    }
}
