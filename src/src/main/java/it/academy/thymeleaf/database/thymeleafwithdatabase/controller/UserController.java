package it.academy.thymeleaf.database.thymeleafwithdatabase.controller;

import it.academy.thymeleaf.database.thymeleafwithdatabase.entity.User;
import it.academy.thymeleaf.database.thymeleafwithdatabase.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/signup")
    public String showSignUpForm(User user){
        return "add-user";
    }
    @PostMapping("/adduser")
    public String addUser(@Validated User user, BindingResult result, Model model){
        if (result.hasErrors()) {
            return "add-user";
        }
        userRepository.save(user);
        return "redirect:/index";
    }
    @GetMapping("/index")
    public String showUserList(Model model) {
        model.addAttribute("users",userRepository.findAll());
        return "index";
    }
    @GetMapping("/edit{id}")
    public String showUpdateForm(@PathVariable("id") Long id,Model model){
        User user = userRepository.findById(id).orElseThrow(()
                -> new IllegalArgumentException("invalid user id:" + id));
        model.addAttribute("user",user);
        return "uodate-user";
    }
    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") Long id, @Validated User user,
                             BindingResult result, Model model) {
        if (result.hasErrors()) {
            user.setId(id);
            return "update-user";
        }

        userRepository.save(user);
        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id, Model model) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        userRepository.delete(user);
        return "redirect:/index";
    }
}
