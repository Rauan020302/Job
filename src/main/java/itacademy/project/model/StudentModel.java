package itacademy.project.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel {
    private String password;

    private String username;

    private Long status;

    private String name;

    private Integer age;

    private String gender;

    private LocalDateTime createdDate = LocalDateTime.now();

    private Long cabinetId;
}
