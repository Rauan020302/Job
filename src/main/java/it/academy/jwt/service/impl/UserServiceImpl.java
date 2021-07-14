package it.academy.jwt.service.impl;

import it.academy.jwt.entity.Role;
import it.academy.jwt.entity.User;
import it.academy.jwt.enums.Status;
import it.academy.jwt.repository.RoleRepository;
import it.academy.jwt.repository.UserRepository;
import it.academy.jwt.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User register(User user) {
        Role roleUser = roleRepository.findByName("ROLE_USER");
        List<Role> userRoles = new ArrayList<>();
        userRoles.add(roleUser);

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(userRoles);
        user.setStatus(Status.ACTIVE);

        User registeredUser = userRepository.save(user);

        log.info("IN register - user: {} successfully registered", registeredUser);
        return registeredUser;
    }

    @Override
    public List<User> getAll() {
        List<User> result = userRepository.findAll();
        log.info("IN getALL - {} users found", result.size());
        return result;
    }

    @Override
    public User findByUserName(String userName) {
        User result = userRepository.findByUsername(userName);
        log.info("IN findByUserName - user: {} found by username: {}",result,userName);
        return result;
    }

    @Override
    public User findById(Long id) {
        User result = userRepository.findById(id).get();

        if (result == null){
            log.warn("IN findByID - no user found by id: {}", id);
            return null;
        }

        log.info("IN findById - user: {} found by id: {}",result);
        return result;
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
        log.info("IN delete - user with id: {} successfully deleted");

    }
}
