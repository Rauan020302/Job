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
}
