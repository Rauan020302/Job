package itacademy.project.service;

import itacademy.project.entity.User;

import java.util.List;

public interface UserService {
    User save(User user);
    User findById(Long id);
    List<User> getAllUsers();
}
