package itacademy.project.controller;

import itacademy.project.entity.Task;
import itacademy.project.model.TaskModel;
import itacademy.project.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
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
    @GetMapping("/by_user/{id}")
    public List<Task> findAllByUserId(@PathVariable Long id){
        return taskService.findAllByUser_Id(id);
    }
    @GetMapping("/by_subject/{id}")
    public List<Task> findAllBySubjectId(@PathVariable Long id){
        return taskService.findAllBySubject_Id(id);
    }
}
