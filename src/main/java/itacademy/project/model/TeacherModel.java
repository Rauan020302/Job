package itacademy.project.model;

import itacademy.project.enums.EnumSubject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeacherModel {
    private String password;

    private String username;

    private Long status;

    private String name;

    private Integer age;

    private String gender;

    private EnumSubject profession;

    private Long cabinetId;
}
