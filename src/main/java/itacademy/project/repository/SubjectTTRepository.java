package itacademy.project.repository;

import itacademy.project.entity.SubjectTimeTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectTTRepository extends JpaRepository<SubjectTimeTable,Long> {
}
