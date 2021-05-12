package itacademy.project.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user_role")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role_name",nullable = false)
    private String roleName;

    @ManyToOne
    @JoinColumn(name = "user_id"/*,nullable = false*/)
    private User user;

}
