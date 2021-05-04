package itacademy.project.service;

import itacademy.project.entity.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    Task save (Task task);
}
