package com.tys.controllers;

import com.tys.entities.Wallet;
import com.tys.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/wallet")
public class WalletController {
    @Autowired
    private WalletService walletService;

    @GetMapping("/find-allWallet")
    public List<Wallet> findAll(){
        List<Wallet> listWallet = walletService.findAll();
        return  listWallet;
    }

    //receive by request param
    @GetMapping("/param-find-by-id")
    public Wallet getByIdWithParam(@RequestParam Long walletId){

        Wallet wallet = walletService.findById(walletId);
        return wallet;
    }

    @GetMapping("/balance")
    public Double balance(){
        Double balance =21.8;
        return balance;
    }

}
