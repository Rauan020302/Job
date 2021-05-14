package itacademy.project.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "subject_time_table")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class SubjectTimeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subjects;

    @ManyToOne
    @JoinColumn(name = "time_table_id")
    private TimeTable timeTables;
}
