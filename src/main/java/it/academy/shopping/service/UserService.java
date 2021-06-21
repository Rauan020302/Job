package it.academy.shopping.service;

import it.academy.shopping.entity.User;
import it.academy.shopping.model.UserModel;
import it.academy.shopping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public void create(UserModel userModel){
        User user = new User();
        user.setUsername(userModel.getUsername());
        user.setPassword(passwordEncoder.encode(userModel.getPassword()));
        userRepository.save(user);
    }

}
