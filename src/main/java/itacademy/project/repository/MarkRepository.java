package itacademy.project.repository;

import itacademy.project.entity.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarkRepository extends JpaRepository<Mark,Long> {
//    List<Mark> findAllBy(String studentName);
}
