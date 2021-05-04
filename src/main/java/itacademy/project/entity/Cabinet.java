package itacademy.project.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

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

    @Column(name = "cabinet_name")
    private String name;

}
