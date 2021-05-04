package itacademy.project.controller;

import itacademy.project.entity.User;
import itacademy.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return userService.findById(userId);
    }
}
