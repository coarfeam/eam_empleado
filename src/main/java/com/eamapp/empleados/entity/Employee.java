package com.eamapp.empleados.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(
        name="employee",
        indexes = {@Index(name="nif_index",columnList = "nif"),
        @Index(name="name_index", columnList = "name")}
)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "El id no puede estar vacio")
    private Long id;
    @Column(name = "nif", length = 50, nullable = false)
    @NotEmpty(message = "El nif no puede estar vacio")
    private String nif;
    @Column(name = "name", length = 100, nullable = false)
    @NotEmpty(message = "El nombre no puede estar vacio")
    private String name;
    @Column(name = "apellido1", length = 100, nullable = false)
    @NotEmpty(message = "El apellido1 no puede estar vacio")
    private String apellido1;
    @Column(name = "apellido2", length = 100)
    private String apellido2;
    @Column(name = "id_office", nullable = false)
    @NotEmpty(message = "El nombre no puede estar vacio")
    private Integer id_office;

    public Employee() {
    }

    public Employee(Long id, String nif, String name, String apellido1, String apellido2, Integer id_office) {
        this.id = id;
        this.nif = nif;
        this.name = name;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.id_office = id_office;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Integer getId_office() {
        return id_office;
    }

    public void setId_office(Integer id_office) {
        this.id_office = id_office;
    }
}
