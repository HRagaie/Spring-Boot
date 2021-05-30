package com.example.dto;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="EMP_SEQ")
    @SequenceGenerator(sequenceName = "EMPLOYEE_SEQ",allocationSize = 1,name="EMP_SEQ")
    @Column(name ="ID")
    private int id;
    @Column(name ="NAME")
    private String name;

    @OneToOne
    @JoinColumn(name ="CARID")
    private Car car;

    public Employee(int id, String name, Car car, List<Telephone> telephone, List<Email> email) {
        this.id = id;
        this.name = name;
        this.car = car;
        this.telephone = telephone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Telephone> getTelephone() {
        return telephone;
    }

    public void setTelephone(List<Telephone> telephone) {
        this.telephone = telephone;
    }

    public List<Email> getEmail() {
        return email;
    }

    public void setEmail(List<Email> email) {
        this.email = email;
    }

    public Employee() {

    }

    @OneToMany(mappedBy = "employee")
    private List<Telephone> telephone;

    @OneToMany(mappedBy = "employee")
    private List<Email> email;
}
