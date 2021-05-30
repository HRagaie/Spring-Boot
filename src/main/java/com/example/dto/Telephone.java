package com.example.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name ="TELEPHONE")
public class Telephone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
    private BigDecimal id;
    @Column(name ="TELEPHONE")
    private String telephone;

    @ManyToOne
    @JoinColumn(name ="EMP_ID")
    private Employee employee;
    public Telephone() {
    }

    public Telephone(BigDecimal id, String telephone, Employee employee) {
        this.id = id;
        this.telephone = telephone;
        this.employee = employee;
    }
    @JsonIgnore
    public Employee getEmployee() {
        return employee;
    }
    @JsonIgnore
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
