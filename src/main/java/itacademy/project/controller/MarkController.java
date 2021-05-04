package itacademy.project.controller;

import itacademy.project.entity.Mark;
import itacademy.project.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mark")
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

}
