package it.academy.scheduled.repository;

import it.academy.scheduled.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value = "SELECT * from users " +
                "WHERE email is not null " +
                "AND extract(Month from birthday) = :m " +
                "AND extract(Day from birthday) = :d ",
                 nativeQuery = true)
    List<User> findByMatchMonthAndMatchDay(@Param("m") int month, @Param("d") int day);
}
