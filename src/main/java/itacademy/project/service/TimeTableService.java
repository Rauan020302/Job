package itacademy.project.service;

import itacademy.project.entity.TimeTable;
import itacademy.project.model.TimeTableModel;

import java.util.List;

public interface TimeTableService {
    List<TimeTable> getAllTimeTables();
    TimeTable save(TimeTableModel timeTableModel);
    TimeTable getTimeTableById(Long id);
    TimeTable deleteTimeTableById(Long id);
}
