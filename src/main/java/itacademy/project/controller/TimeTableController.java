package itacademy.project.controller;

import itacademy.project.entity.TimeTable;
import itacademy.project.service.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/timetable")
public class TimeTableController {
    @Autowired
    private TimeTableService timeTableService;
    @GetMapping
    public List<TimeTable> getAllTimeTables(){
        return timeTableService.getAllTimeTables();
    }
    @PostMapping
    public TimeTable save(@RequestBody TimeTable timeTable){
        return timeTableService.save(timeTable);
    }
    @GetMapping("/{tableId}")
    public TimeTable getTimeTableById(@PathVariable Long tableId){
        return timeTableService.getTimeTableById(tableId);
    }
}
