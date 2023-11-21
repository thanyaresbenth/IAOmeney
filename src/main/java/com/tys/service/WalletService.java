package com.tys.service;

import com.tys.Request.PersonRequest;
import com.tys.Request.WalletRequest;
import com.tys.entities.Person;
import com.tys.entities.Wallet;
import com.tys.repositories.PersonRepository;
import com.tys.repositories.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WalletService {
    @Autowired
    public PersonRepository personRepository;
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
    public Wallet createWallet(WalletRequest walletRequest){
        Wallet wallet = new Wallet();
        Long personId = walletRequest.getPersonId();
        System.out.println(personId);
        System.out.println(walletRequest.getBalance());

        Person person  =personRepository.findById(personId).orElse(null);
        wallet.setBalance(walletRequest.getBalance());
        wallet.setPerson(person);
        walletRepository.save(wallet);
        return wallet;




    }

}
