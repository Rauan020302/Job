package thymeleaf.hello_world.springboottutorial;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Employee {
    private String firstName;
    private String lastName;
    private String email;
}
