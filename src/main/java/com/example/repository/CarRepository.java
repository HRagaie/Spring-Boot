package com.example.repository;
import com.example.dto.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface CarRepository extends JpaRepository<Car, BigDecimal> {
}
