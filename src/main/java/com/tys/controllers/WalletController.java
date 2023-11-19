package com.tys.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wallet")
public class WalletController {
    @GetMapping("/balance")
    public Double balance(){
        Double balance =21.8;
        return balance;
    }

}
