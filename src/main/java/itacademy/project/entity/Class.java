package itacademy.project.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "class")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "class_name")
    private String name;

    @OneToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

//    @OneToMany
//    @JoinColumn(name = "students_id")
//    private List<Student> student;
}
