package com.tys.service;

import com.tys.entities.Wallet;
import com.tys.repositories.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WalletService {
    @Autowired
    public WalletRepository walletRepository;

    public List<Wallet>findAll(){
        List<Wallet> listWallet = walletRepository.findAll();
        return listWallet;
    }

    public Wallet findById(Long walletId){

        Wallet wallet = walletRepository.findById(walletId).orElse(null);

        return wallet;
    }

}
