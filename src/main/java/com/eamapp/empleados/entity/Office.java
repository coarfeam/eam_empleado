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
    private Integer id;
    @Column(name = "name", nullable = false, length = 100)
    private String name;
    @Column(name = "estimate")
    private Double estimate;
    @Column(name = "expense")
    private Double expense;

    public Office() {
    }

    public Office(Integer id, String name, Double estimate, Double expense) {
        this.id = id;
        this.name = name;
        this.estimate = estimate;
        this.expense = expense;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getEstimate() {
        return estimate;
    }

    public void setEstimate(Double estimate) {
        this.estimate = estimate;
    }

    public Double getExpense() {
        return expense;
    }

    public void setExpense(Double expense) {
        this.expense = expense;
    }
}
