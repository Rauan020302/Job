package itacademy.project.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "task")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "task_text")
    private String taskText;

    @OneToOne
    @JoinColumn(name = "mark_id")
    private Mark mark;

    @Column(name = "task_date")
    private LocalDate taskDate = LocalDate.now();

    @Column(name = "deadline")
    private LocalDate deadline;
}
