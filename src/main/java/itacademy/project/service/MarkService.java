package itacademy.project.service;

import itacademy.project.entity.Mark;

import java.util.List;

public interface MarkService {
     List<Mark> getAllMarks();
     Mark save(Mark mark);
}
