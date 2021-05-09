package itacademy.project.controller;

import itacademy.project.entity.Mark;
import itacademy.project.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mark")
public class MarkController {
    @Autowired
    private MarkService markService;

    @GetMapping
    public List<Mark> getAllMarks(){
        return markService.getAllMarks();
    }
    @PostMapping
    public Mark save(@RequestBody Mark mark){
        return markService.save(mark);
    }
    @GetMapping("/{markId}")
    public Mark getMarkById(@PathVariable Long markId){
        return markService.getMarkById(markId);
    }
    @DeleteMapping("/{markId}")
    public Mark deleteMarkById(@PathVariable Long markId){
        return markService.deleteMarkById(markId);
    }

}
