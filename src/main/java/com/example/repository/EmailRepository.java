package com.example.repository;

import com.example.dto.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface EmailRepository extends JpaRepository<Email, BigDecimal> {
}
