package itacademy.project.controller;

import itacademy.project.entity.User;
import itacademy.project.model.StudentModel;
import itacademy.project.service.NewStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class NewStudentController {
    @Autowired
    private NewStudentService newStudentService;

    @GetMapping
    public List<User> getAllStudents(){
        return newStudentService.getAllStudents();
    }
    @GetMapping("/{studentId}")
    public User getStudentById(@PathVariable Long studentId){
        return newStudentService.getStudentById(studentId);
    }
    @DeleteMapping("/{studentId}")
    public User deleteStudentById(@PathVariable Long studentId){
        return newStudentService.deleteStudentById(studentId);
    }
}
