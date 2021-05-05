package itacademy.project.entity;

import itacademy.project.enums.EnumTimeTable;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
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

    @Column(name = "date_start")
    private LocalDateTime dateStart;

    @Column(name = "date_end")
    private LocalDateTime dateEnd;

    @ManyToOne
    @JoinColumn(name = "cabinet_id")
    private Cabinet cabinet;
}
