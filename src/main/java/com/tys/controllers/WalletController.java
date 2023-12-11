package com.tys.controllers;

import com.tys.Request.WalletRequest;
import com.tys.entities.Wallet;
import com.tys.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Scanner;
@CrossOrigin(origins ="*")
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
        System.out.println("create-wallet");
        Wallet wallet = walletService.createWallet(walletRequest);
        String walletId =wallet.getWalletId().toString();
        System.out.println(walletId);
        return walletId;
    }
    @PostMapping("/update-wallet")
    public String updateWallet(@RequestBody WalletRequest walletRequest){
        walletService.updateWallet(walletRequest);
        return "wallet";
    }
    @PostMapping("/delete-wallet")
    public String deleteWallet(@RequestBody WalletRequest walletRequest){
        walletService.deleteWallet(walletRequest.getWalletId());
        return "wallet";
    }


}
