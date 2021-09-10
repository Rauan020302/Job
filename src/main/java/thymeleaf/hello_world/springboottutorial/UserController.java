package thymeleaf.hello_world.springboottutorial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/if-unless")
    public String users(Model model){
        List<User> users = new ArrayList<>();
        users.add(new User("Rauan", "email", "ADMIN"));
        users.add(new User("Bale", "BalEmail", "USER"));
        users.add(new User("Ramos", "Ramos92", "USER"));
        users.add(new User("Mount", "Mount@G", "ADMIN"));
        model.addAttribute("users",users);
        return "if-unless";
    }
    @GetMapping("/switch-case")
    public String switchExample(Model model){
        User user = new User("Rauan","email", "ADMIN");
        model.addAttribute("user",user);
        return "switch-case";
    }
}
