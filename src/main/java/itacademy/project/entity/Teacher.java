package itacademy.project.entity;

import lombok.*;

import javax.persistence.*;

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

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "cabinet_id")
    private Cabinet cabinet;
}
