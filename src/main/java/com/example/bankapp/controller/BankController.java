package com.example.bankapp.controller;

import com.example.bankapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BankController {

    @Autowired
    private AccountService accountService;
}
