package itacademy.project.model;

import itacademy.project.enums.EnumTimeTable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TimeTableModel {
    private EnumTimeTable dayOfWeek;

    private LocalDateTime dateStart;

    private LocalDateTime dateEnd;

    private Long cabinetId;
}
