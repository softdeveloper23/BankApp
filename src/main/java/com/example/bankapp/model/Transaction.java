package com.example.bankapp.model;

import jakarta.persistence.Entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Transaction {

    private Long id;
    private BigDecimal amount;
    private String type;
    private LocalDateTime timestamp;
}
