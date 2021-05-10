package itacademy.project.controller;

import itacademy.project.entity.User;
import itacademy.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId){
        return userService.getUserById(userId);
    }

    @GetMapping()
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/{userId}")
    public User deleteUserById(@PathVariable Long userId){
        return userService.deleteUserById(userId);
    }
    @GetMapping("/get_name")
    public String getName(Principal principal){
        return principal.getName();
    }
//    @DeleteMapping("/{userId}")
//    public User banById(@PathVariable Long userId){
//        return userService.banById(userId);
//    }
}
