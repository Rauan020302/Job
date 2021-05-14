package itacademy.project.entity;

import itacademy.project.enums.EnumSubject;
import lombok.*;

import javax.persistence.*;
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

    @Column(name = "user_password",nullable = false)
    private String password;

    @Column(name = "login",nullable = false,unique = true)
    private String username;

    @Column(name = "status")
    private Long status;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "gender")
    private String gender;

    @Column(name = "profession")
    @Enumerated(EnumType.STRING)
    private EnumSubject profession;

    @Column(name = "created_date")
    private LocalDateTime createdDate = LocalDateTime.now();



}
