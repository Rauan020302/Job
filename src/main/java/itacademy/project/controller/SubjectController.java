package itacademy.project.controller;

import itacademy.project.entity.Subject;
import itacademy.project.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public List<Subject> getAllSubjects(){
        return subjectService.getAllSubjects();
    }
    @PostMapping
    public Subject save(@RequestBody Subject subject){
        return subjectService.save(subject);
    }
    @GetMapping("/{subjectId}")
    public Subject getById(@PathVariable Long subjectId){
        return subjectService.getById(subjectId);
    }
}
