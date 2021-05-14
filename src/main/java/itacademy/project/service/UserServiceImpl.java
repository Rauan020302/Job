package itacademy.project.service;

import itacademy.project.entity.User;
import itacademy.project.entity.UserRole;
import itacademy.project.model.AuthModel;
import itacademy.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserRoleService userRoleService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User save(User user) {
        if (user.getUsername().equals("") || user.getPassword().equals("") || user.getUsername() == null || user.getPassword() == null){
            return null;
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user = userRepository.save(user);
        UserRole userRole = new UserRole();
        userRole.setRoleName("ROLE_ADMIN");
        userRole.setUser(user);
        userRoleService.save(userRole);
        return user;
    }

    @Override
    public User deleteUserById(Long id) {
        User user = getUserById(id);
        if (user != null){
            userRepository.delete(user);
            return user;
        }
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        System.out.println("Дайте users для " + SecurityContextHolder.getContext().getAuthentication().getName());
        return userRepository.findAll();
    }

    @Override
    public User findByUsername(String login) {
        return userRepository.findByUsername(login).orElse(null);
    }

    @Override
    public String getTokenByAuthModel(AuthModel authModel) {
        String authResult = "";
        User user = findByUsername(authModel.getUsername());
        if (user == null) authResult = "Неверный логин/пароль";
        else{

            if (passwordEncoder.matches(authModel.getPassword(),user.getPassword())){
                String loginPassPair = user.getUsername() + ":" + authModel.getPassword();
                authResult = "Basic " + Base64.getEncoder().encodeToString(loginPassPair.getBytes());
            }else authResult = "Неверный логин/пароль";
        }

        return authResult;
    }

    @Override
    public User unBanById(Long id) {
        User user = getUserById(id);
        if(user == null) {
            return null;
        }

        user.setStatus(1L);
        return save(user);
    }

    @Override
    public List<User> findAllByStatus(Long status) {
        return userRepository.findAllByStatus(status);
    }



//    @Override
//    public User banById(Long id) {
//        User user = getUserById(id);
//        if(user == null) {
//            return null;
//        }
//
//        user.setStatus(0L);
//        return save(user);
//    }
}

