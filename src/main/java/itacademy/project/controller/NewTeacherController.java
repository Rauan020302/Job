package itacademy.project.controller;

import itacademy.project.entity.User;
import itacademy.project.model.TeacherModel;
import itacademy.project.service.NewTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teacher")
public class NewTeacherController {
    @Autowired
    private NewTeacherService newTeacherService;

    @GetMapping
    public List<User> getAllTeachers(){
        return newTeacherService.getAllTeachers();
    }
    @GetMapping("/{teacherId}")
    public User getTeacherById(@PathVariable Long teacherId){
        return newTeacherService.getTeacherById(teacherId);
    }
    @DeleteMapping("/{teacherId}")
    public User deleteTeacherById(@PathVariable Long teacherId){
        return newTeacherService.deleteTeacherById(teacherId);
    }
}
