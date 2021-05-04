package itacademy.project.entity;

import itacademy.project.enums.EnumSubject;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "subject")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subject_name")
    private EnumSubject name;

    @ManyToOne
    @JoinColumn(name = "time_table_id")
    private TimeTable timeTable;
}
