package com.eamapp.empleados.entity;

import jakarta.persistence.*;

@Entity
@Table(
        name = "office",
        indexes = {@Index(name = "name_index", columnList = "name", unique = true),
                @Index(name = "estimate_index", columnList = "estimate")}
)
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false, length = 100)
    private String name;
    @Column(name = "estimate")
    private Double estimate;
    @Column(name = "expense")
    private Double expense;
}
