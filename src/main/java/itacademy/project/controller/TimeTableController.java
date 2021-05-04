package itacademy.project.controller;

import itacademy.project.entity.TimeTable;
import itacademy.project.service.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
