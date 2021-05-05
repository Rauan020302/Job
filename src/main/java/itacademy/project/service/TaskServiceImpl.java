package itacademy.project.service;

import itacademy.project.entity.Mark;
import itacademy.project.entity.Subject;
import itacademy.project.entity.Task;
import itacademy.project.model.TaskModel;
import itacademy.project.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private MarkService markService;
    @Autowired
    private SubjectService subjectService;

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task save(TaskModel taskModel) {
        Mark mark = markService.getMarkById(taskModel.getMarkId());
        Subject subject = subjectService.getSubjectById(taskModel.getSubjectId());
        if (mark == null || subject == null)return null;
        Task task = Task.builder()
                .taskText(taskModel.getTaskText())
                .taskDate(taskModel.getTaskDate())
                .deadline(taskModel.getDeadline())
                .mark(mark)
                .subject(subject).build();
        return taskRepository.save(task);
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public Task deleteTaskById(Long id) {
        Task task = getTaskById(id);
        if (task != null ){
            taskRepository.delete(task);
            return task;
        }
        return null;
    }
}
