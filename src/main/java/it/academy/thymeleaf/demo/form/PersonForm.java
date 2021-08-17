package it.academy.thymeleaf.demo.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonForm {
    private String firstName;
    private String lastName;
}
