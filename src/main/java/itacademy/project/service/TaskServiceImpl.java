package itacademy.project.service;

import itacademy.project.entity.Subject;
import itacademy.project.entity.Task;
import itacademy.project.entity.User;
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
    private SubjectService subjectService;
    @Autowired
    private UserService userService;

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task save(TaskModel taskModel) {
        Subject subject = subjectService.getSubjectById(taskModel.getSubjectId());
        User user = userService.getUserById(taskModel.getUserId());
        if (subject == null || user == null)return null;
        Task task = Task.builder()
                .taskText(taskModel.getTaskText())
                .taskDate(taskModel.getTaskDate())
                .mark(taskModel.getMark())
                .user(user)
                .deadline(taskModel.getDeadline())
                .subject(subject).build();
        return taskRepository.save(task);
    }

    @Override
    public List<Task> findAllByUser_Id(Long id) {
        return taskRepository.findAllByUser_Id(id);
    }

    @Override
    public List<Task> findAllBySubject_Id(Long id) {
        return taskRepository.findAllBySubject_Id(id);
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
