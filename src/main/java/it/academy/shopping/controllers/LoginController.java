package it.academy.shopping.controllers;

import it.academy.shopping.model.UserModel;
import it.academy.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }
    @GetMapping("/register")
    public String registerPage(Model model){
        model.addAttribute("user",new UserModel());
        return "register";
    }
    @PostMapping("/register")
    public String registerNewUser(@Valid @ModelAttribute("user") UserModel userModel, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "register";
        }
        if (!userModel.getPassword().equals(userModel.getRepeatPassword())){
            bindingResult.rejectValue("password","","Пароли не совпадают ");
            return "register";
        }

        userService.create(userModel);
        return "redirect:/login";


    }
}
