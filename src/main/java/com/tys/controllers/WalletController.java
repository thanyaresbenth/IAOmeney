package com.tys.controllers;

import com.tys.Request.WalletRequest;
import com.tys.entities.Wallet;
import com.tys.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/create-wallet")
    public String createWallet(@RequestBody WalletRequest walletRequest){
        walletService.createWallet(walletRequest);
        return "wallet";
    }

}
