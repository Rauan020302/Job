package itacademy.project.repository;

import itacademy.project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewStudentRepository extends JpaRepository<User,Long>{
}
