package itacademy.project.controller;

import itacademy.project.entity.Subject;
import itacademy.project.model.SubjectModel;
import itacademy.project.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/api/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public List<Subject> getAllSubjects(){
        return subjectService.getAllSubjects();
    }
    @PostMapping
    public Subject save(@RequestBody SubjectModel subjectModel){
        return subjectService.save(subjectModel);
    }
    @GetMapping("/{subjectId}")
    public Subject getSubjectById(@PathVariable Long subjectId){
        return subjectService.getSubjectById(subjectId);
    }
    @DeleteMapping("/{subjectId}")
    public Subject deleteSubjectById(@PathVariable Long subjectId){
        return subjectService.deleteSubjectById(subjectId);
    }
}
