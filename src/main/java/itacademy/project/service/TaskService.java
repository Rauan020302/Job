package itacademy.project.service;

import itacademy.project.entity.Task;
import itacademy.project.model.TaskModel;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    Task save (TaskModel taskModel);
    Task getTaskById(Long id);
    Task deleteTaskById(Long id);
}
