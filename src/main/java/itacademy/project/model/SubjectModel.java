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

public class SubjectModel {

    private EnumSubject name;

    private Long timeTableId;
}
