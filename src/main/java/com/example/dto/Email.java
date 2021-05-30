package com.example.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name ="EMAIL")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
    private BigDecimal id;
    @Column(name ="EMAIL")
    private String email;
    @ManyToOne
    @JoinColumn(name ="EMP_ID")
    private Employee employee;
    @JsonIgnore
    public Employee getEmployee() {
        return employee;
    }
    @JsonIgnore
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Email() {
    }

    public Email(BigDecimal id, String email, Employee employee) {
        this.id = id;
        this.email = email;
        this.employee = employee;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
