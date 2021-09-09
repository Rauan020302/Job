package student.managment.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import student.managment.demo.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}
