package itacademy.project.service;

import itacademy.project.entity.User;
import itacademy.project.model.AuthModel;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User save(User user);
    User getUserById(Long id);
    User deleteUserById(Long id);
    User findByUsername(String login);
    String getTokenByAuthModel(AuthModel authModel);
    List<User> findAllByStatus(Long status);
}
