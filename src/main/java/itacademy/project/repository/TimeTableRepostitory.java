package itacademy.project.repository;

import itacademy.project.entity.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeTableRepostitory extends JpaRepository<TimeTable,Long> {
}
