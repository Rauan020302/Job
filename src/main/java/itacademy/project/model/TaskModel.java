package itacademy.project.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TaskModel {
    private String taskText;

    private Integer mark;

    private Long subjectId;

    private Long userId;

    private LocalDate taskDate = LocalDate.now();

    private LocalDate deadline;
}
