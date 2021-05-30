package com.example.repository;



import com.example.dto.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface TelephoneRepository extends JpaRepository<Telephone, BigDecimal> {
}
