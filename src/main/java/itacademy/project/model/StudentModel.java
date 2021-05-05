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
    private String name;

    private Integer age;

    private Long markId;

    private Long teacherId;

    private Long userId;

    private Long cabinetId;
}
