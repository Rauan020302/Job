package itacademy.project.controller;

import itacademy.project.entity.Task;
import itacademy.project.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }
    @PostMapping
    public Task save(@RequestBody Task task){
        return taskService.save(task);
    }
    @GetMapping("/{taskId}")
    public Task getById(@PathVariable Long taskId){
        return taskService.getById(taskId);
    }
}
