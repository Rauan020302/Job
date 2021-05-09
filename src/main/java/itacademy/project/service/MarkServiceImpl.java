package itacademy.project.service;

import itacademy.project.entity.Mark;
import itacademy.project.repository.MarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MarkServiceImpl implements MarkService {
    @Autowired
    private MarkRepository markRepository;

    @Override
    public List<Mark> getAllMarks() {
        return markRepository.findAll();
    }

    @Override
    public Mark save(Mark mark) {
        return markRepository.save(mark);
    }

    @Override
    public Mark getMarkById(Long id) {
        return markRepository.findById(id).orElse(null);
    }

    @Override
    public Mark deleteMarkById(Long id) {
        Mark mark = getMarkById(id);
        if (mark != null){
            markRepository.delete(mark);
            return mark;
        }
        return null;
    }

//    @Override
//    public List<Mark> getAllMarkByStudentName(String studentName) {
//        return markRepository.findAllByName(studentName);
//    }
}
