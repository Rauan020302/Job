package itacademy.project.repository;

import itacademy.project.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
    List<Task> findAllByUser_Id (Long id);
    List<Task> findAllBySubject_Id(Long id);
}
