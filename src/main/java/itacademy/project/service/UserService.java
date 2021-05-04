package itacademy.project.service;

import itacademy.project.entity.User;

public interface UserService {
    User save(User user);
    User findById(Long id);
}
