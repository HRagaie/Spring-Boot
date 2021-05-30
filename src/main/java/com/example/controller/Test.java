package com.example.controller;

import com.example.dto.Car;
import com.example.dto.Email;
import com.example.dto.Employee;

import com.example.dto.Telephone;
import com.example.repository.CarRepository;
import com.example.repository.EmployeeRepository;
import com.example.repository.EmailRepository;
import com.example.repository.TelephoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Test {

    private EmployeeRepository employeeRepository;
    private CarRepository carRepository;
    private TelephoneRepository telephoneRepository;
    private EmailRepository emailRepository;

    @Autowired
    public Test(EmployeeRepository employeeRepository, CarRepository carRepository, TelephoneRepository telephoneRepository, EmailRepository emailRepository){
        this.carRepository=carRepository;
        this.employeeRepository=employeeRepository;
        this.emailRepository = emailRepository;
        this.telephoneRepository = telephoneRepository;
    }


    @PostMapping("/employee")
    public Employee postEmployee(@RequestBody Employee employee){
        Employee e = this.employeeRepository.save(employee);
        return e;
    }

    @PostMapping("/car")
    public Car postCar(@RequestBody Car car){
        Car c = this.carRepository.save(car);
        return c;

    }
    @PostMapping("/telephone")
    public Telephone postTelephone(@RequestBody Telephone telephone){
        Telephone t = this.telephoneRepository.save(telephone);
        return t;

    }

    @PostMapping("/email")
    public Email postEmail(@RequestBody Email email){
        Email e = this.emailRepository.save(email);
        return e;

    }
    @GetMapping("/get/{id}")
    public  Employee getEmployeeById(@PathVariable(value="id") String id){
        Optional<Employee> e = this.employeeRepository.findById(Integer.parseInt(id));
        return e.get();
    }

}
