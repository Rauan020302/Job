package it.academy.scheduled.service;

import it.academy.scheduled.entity.User;
import java.util.List;

public interface UserRepositoryService {

    List<User> getUsersByBirthday(int month, int day);
}
