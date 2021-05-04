package itacademy.project.service;

import itacademy.project.entity.TimeTable;

import java.util.List;

public interface TimeTableService {
    List<TimeTable> getAllTimeTables();
    TimeTable save(TimeTable timeTable);
    TimeTable getTimeTableById(Long id);
}
