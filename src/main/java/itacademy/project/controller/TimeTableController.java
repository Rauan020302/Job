package itacademy.project.controller;

import itacademy.project.entity.TimeTable;
import itacademy.project.model.TimeTableModel;
import itacademy.project.service.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/timetable")
public class TimeTableController {
    @Autowired
    private TimeTableService timeTableService;
    @GetMapping
    public List<TimeTable> getAllTimeTables(){
        return timeTableService.getAllTimeTables();
    }
    @PostMapping
    public TimeTable save(@RequestBody TimeTableModel timeTableModel){
        return timeTableService.save(timeTableModel);
    }
    @GetMapping("/{tableId}")
    public TimeTable getTimeTableById(@PathVariable Long tableId){
        return timeTableService.getTimeTableById(tableId);
    }
    @DeleteMapping("/{tableId}")
    public TimeTable deleteTimeTableById(@PathVariable Long tableId){
        return timeTableService.deleteTimeTableById(tableId);

    }
}
