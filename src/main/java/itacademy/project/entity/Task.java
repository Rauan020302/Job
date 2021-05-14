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

    @Column(name = "mark")
    private Integer mark;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "task_date")
    private LocalDate taskDate = LocalDate.now();

    @Column(name = "deadline")
    private LocalDate deadline = LocalDate.now();
}
