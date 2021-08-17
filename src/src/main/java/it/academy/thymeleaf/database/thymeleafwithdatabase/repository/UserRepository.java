package it.academy.thymeleaf.database.thymeleafwithdatabase.repository;

import it.academy.thymeleaf.database.thymeleafwithdatabase.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
}
