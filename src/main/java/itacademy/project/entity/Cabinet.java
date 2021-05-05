package itacademy.project.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "cabinet")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Cabinet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "cabinet_name")
    private String name;

}
