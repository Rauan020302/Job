package itacademy.project.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teacher")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "teacher_name")
    private String name;

    @Column(name = "age")
    private Integer age;

//    @OneToMany
//    @JoinColumn(name = "students_id")
//    private List<Student> student;

    @OneToOne
    @JoinColumn(name = "classes_id")
    private Class aClass;
}
