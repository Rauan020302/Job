package itacademy.project.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "mark")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "marks")
    private Integer marks;
}
