package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pay")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Pay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @Column(name = "account")
    private Long account;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "command")
    private String command;

    @Column(name = "date")
    private LocalDateTime date;
}
