package itacademy.project.controller;

import itacademy.project.entity.SubjectTimeTable;
import itacademy.project.model.SubjectTTModel;
import itacademy.project.service.SubjectTTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subjectTT")
public class SubjectTTController {
    @Autowired
    private SubjectTTService subjectTTService;

    @GetMapping
    public List<SubjectTimeTable> getAllSubjectTT(){
        return subjectTTService.getAllSubjectTT();
    }
    @GetMapping("/{id}")
    public SubjectTimeTable getSubjectTTById(@PathVariable Long id){
        return subjectTTService.getSubjectTTById(id);
    }
    @PostMapping
    public SubjectTimeTable save(@RequestBody SubjectTTModel subjectTTModel){
        return subjectTTService.save(subjectTTModel);
    }
    @DeleteMapping("/{id}")
    public SubjectTimeTable deleteSubjectTTById(@PathVariable Long id){
        return subjectTTService.deleteSubjectTTById(id);
    }
}
