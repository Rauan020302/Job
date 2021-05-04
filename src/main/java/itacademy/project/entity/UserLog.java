package itacademy.project.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "user_log")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class UserLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

    @Column(name = "login_time")
    private LocalDate loginTime;

    @Column(name = "login_result")
    private String loginResult;
}
