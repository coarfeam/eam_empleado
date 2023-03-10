package com.eamapp.empleados.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(
        name = "office",
        indexes = {@Index(name = "name_index", columnList = "name", unique = true),
                @Index(name = "estimate_index", columnList = "estimate")}
)
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false, length = 100)
    private String name;
    @Column(name = "estimate")
    private Double estimate;
    @Column(name = "expense")
    private Double expense;

    @OneToMany(mappedBy="office")
    private List<Employee> employees;

    public Office() {
    }

    public Office(Long id, String name, Double estimate, Double expense) {
        this.id = id;
        this.name = name;
        this.estimate = estimate;
        this.expense = expense;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
