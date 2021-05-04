package itacademy.project.entity;

import itacademy.project.enums.EnumTimeTable;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "timetable")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class TimeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "day_of_week")
    private EnumTimeTable dayOfWeek;

    @OneToMany
    @JoinColumn(name = "subject_id")
    private List<Subject> subject;

    @Column(name = "date_start")
    private LocalDate dateStart;

    @Column(name = "date_end")
    private LocalDate dateEnd;
}
