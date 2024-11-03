package com.example.bankapp.model;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

import java.math.BigDecimal;
import java.util.Collection;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private BigDecimal balance;

    @OneToMany(mappedBy = "account")
    private List<Transaction> transactions;

    @Transient
    private Collection<? extends GrantedAuthority> authorities;

    public Account() {
    }

    public Account(String username, String password, BigDecimal balance, List<Transaction> transactions, Collection<? extends GrantedAuthority> authorities) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.transactions = transactions;
        this.authorities = authorities;
    }
}
