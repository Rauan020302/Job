package itacademy.project.model;

import itacademy.project.entity.Mark;
import itacademy.project.entity.Subject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TaskModel {
    private String taskText;

    private Long markId;

    private Long subjectId;

    private LocalDate taskDate = LocalDate.now();

    private LocalDate deadline;
}
