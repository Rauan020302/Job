package itacademy.project.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "a_user")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name",nullable = false)
    private String name;

    @Column(name = "user_password",nullable = false)
    private String password;

    @Column(name = "login",nullable = false,unique = true)
    private String login;

    @Column(name = "created_date")
    private LocalDateTime createdDate = LocalDateTime.now();

    @Column(name = "role",nullable = false)
    private Integer role;
}
