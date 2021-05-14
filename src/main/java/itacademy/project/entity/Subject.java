package itacademy.project.entity;

import itacademy.project.enums.EnumSubject;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "subjects")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subject_name",unique = true,nullable = false)
    @Enumerated(EnumType.STRING)
    private EnumSubject subject;
}
