package itacademy.project.service;

import itacademy.project.entity.Cabinet;
import itacademy.project.entity.TimeTable;
import itacademy.project.model.TimeTableModel;
import itacademy.project.repository.TimeTableRepostitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TimeTableServiceImpl implements TimeTableService {
    @Autowired
    private TimeTableRepostitory timeTableRepostitory;
    @Autowired
    private CabinetService cabinetService;

    @Override
    public List<TimeTable> getAllTimeTables() {
        return timeTableRepostitory.findAll();
    }

    @Override
    public TimeTable save(TimeTableModel timeTableModel) {
        Cabinet cabinet = cabinetService.getCabinetById(timeTableModel.getCabinetId());
        if (cabinet == null)return null;
        TimeTable timeTable = TimeTable.builder()
                .dayOfWeek(timeTableModel.getDayOfWeek())
                .dateStart(timeTableModel.getDateStart())
                .dateEnd(timeTableModel.getDateEnd())
                .cabinet(cabinet).build();

        return timeTableRepostitory.save(timeTable);
    }

    @Override
    public TimeTable getTimeTableById(Long id) {
        return timeTableRepostitory.findById(id).orElse(null);
    }

    @Override
    public TimeTable deleteTimeTableById(Long id) {
        TimeTable timeTable = getTimeTableById(id);
        if (timeTable != null){
            timeTableRepostitory.delete(timeTable);
            return timeTable;
        }
        return null;
    }
}
