package it.academy.jwt.service;

import it.academy.jwt.entity.User;

import java.util.List;

public interface UserService {
    User register(User user);
    List<User> getAll();
    User findByUserName(String userName);
    User findById(Long id);
    void delete(Long id);
}
