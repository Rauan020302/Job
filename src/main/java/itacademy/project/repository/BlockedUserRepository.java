package itacademy.project.repository;

import itacademy.project.entity.BlockedUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlockedUserRepository extends JpaRepository<BlockedUser,Long> {
    List<BlockedUser> findAllByUser_Status(Long status);
}
