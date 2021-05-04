package itacademy.project.controller;

import itacademy.project.entity.Teacher;
import itacademy.project.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public List<Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }
    @PostMapping
    public Teacher save(@RequestBody Teacher teacher){
        return teacherService.save(teacher);
    }
    @GetMapping("/{teacherId}")
    public Teacher getTeacherById(@PathVariable Long teacherId){
        return teacherService.getTeacherById(teacherId);
    }
}
