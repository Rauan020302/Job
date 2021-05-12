package itacademy.project.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


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

    private Long markId;

    private Long teacherId;

    private Long cabinetId;
}
