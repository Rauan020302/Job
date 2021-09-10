package thymeleaf.hello_world.springboottutorial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    @GetMapping("/iteration")
    public String bootstrap(Model model){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Rauan", "Maksut", "Rauan@Gmail.com"));
        employees.add(new Employee("Bruno", "Fernandesh", "Bruno@Gmail.com"));
        employees.add(new Employee("Jadon", "Sancho", "Sancho@Gmail.com"));
        employees.add(new Employee("Paul", "Pogba", "Pogba@Gmail.com"));
        model.addAttribute("employees",employees);
        return "iteration";
    }
}
