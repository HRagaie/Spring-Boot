package com.example.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name ="CAR")

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
    private BigDecimal id;
    @Column(name ="MODEL")
    private String model;
    @Column(name ="YEAR_MFG")
    private String year_mfg;
    @Column(name ="MAKE")
    private String make;

   @OneToOne(mappedBy = "car")
    private Employee employee;

    public Car() {
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear_mfg() {
        return year_mfg;
    }

    public void setYear_mfg(String year_mfg) {
        this.year_mfg = year_mfg;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
@JsonIgnore
    public Employee getEmployee() {
        return employee;
    }
    @JsonIgnore
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Car(BigDecimal id, String model, String year_mfg, String make, Employee employee) {
        this.id = id;
        this.model = model;
        this.year_mfg = year_mfg;
        this.make = make;
        this.employee = employee;
    }
}
