package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "supplier")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

}
