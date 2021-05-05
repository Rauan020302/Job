package itacademy.project.controller;

import itacademy.project.entity.User;
import itacademy.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User save(@RequestBody User user){
        return userService.save(user);
    }

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
}
