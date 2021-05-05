package itacademy.project.service;

import itacademy.project.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User save(User user);
    User getUserById(Long id);
    User deleteUserById(Long id);
}
