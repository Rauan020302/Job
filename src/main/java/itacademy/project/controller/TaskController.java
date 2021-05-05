package itacademy.project.controller;

import itacademy.project.entity.Task;
import itacademy.project.model.TaskModel;
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
    public Task save(@RequestBody TaskModel taskModel){
        return taskService.save(taskModel);
    }
    @GetMapping("/{taskId}")
    public Task getTaskById(@PathVariable Long taskId){
        return taskService.getTaskById(taskId);
    }
    @DeleteMapping("/{taskId}")
    public Task deleteTaskById(@PathVariable Long taskId){
        return taskService.deleteTaskById(taskId);
    }
}
