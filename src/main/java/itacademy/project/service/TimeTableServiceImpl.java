package itacademy.project.service;

import itacademy.project.entity.TimeTable;
import itacademy.project.repository.TimeTableRepostitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TimeTableServiceImpl implements TimeTableService {
    @Autowired
    private TimeTableRepostitory timeTableRepostitory;

    @Override
    public List<TimeTable> getAllTimeTables() {
        return timeTableRepostitory.findAll();
    }

    @Override
    public TimeTable save(TimeTable timeTable) {
        return timeTableRepostitory.save(timeTable);
    }

    @Override
    public TimeTable getTimeTableById(Long id) {
        return timeTableRepostitory.findById(id).orElse(null);
    }
}
