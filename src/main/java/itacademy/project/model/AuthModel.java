package itacademy.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthModel {
    private String username;

    private String password;

    private LocalDateTime createdDate = LocalDateTime.now();
}
