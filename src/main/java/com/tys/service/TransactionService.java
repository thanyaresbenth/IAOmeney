package com.tys.service;

import com.tys.Request.TransactionRequest;
import com.tys.entities.Item;
import com.tys.entities.Transaction;
import com.tys.entities.Wallet;
import com.tys.repositories.ItemRepository;
import com.tys.repositories.TransactionRepository;
import com.tys.repositories.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    public WalletRepository walletRepository;

    @Autowired
    public ItemRepository itemRepository;

    @Autowired
    public  TransactionRepository transactionRepository;



    public List<Transaction>findAll(){
        List<Transaction> listTransaction = transactionRepository.findAll();
        return listTransaction;

    }
    public Transaction findById(Long transactionId){
        Transaction transaction = transactionRepository.findById(transactionId).orElse(null);
        return transaction;
    }

    public  Transaction createTransaction(TransactionRequest transactionRequest){
        Transaction transaction = new Transaction();
        Long itemId = transactionRequest.getItemId();
        Long walletId = transactionRequest.getWalletId();
        Wallet wallet = walletRepository.findById(walletId).orElse(null);
        Item item = itemRepository.findById(itemId).orElse(null);
        transaction.setItem(item);
        transaction.setWallet(wallet);
        transaction.setDate(transactionRequest.getDate());
        transaction.setBalance(transactionRequest.getBalance());
        transactionRepository.save(transaction);
        return transaction;

    }
    public Transaction updateTransaction(TransactionRequest transactionRequest){
        Long transactionId = transactionRequest.getTransactionId();
        Transaction transaction =transactionRepository.findById(transactionId).orElse(null);
        Long itemId = transactionRequest.getItemId();
        Long walletId = transactionRequest.getWalletId();
        Wallet wallet = walletRepository.findById(walletId).orElse(null);
        Item item = itemRepository.findById(itemId).orElse(null);
        transaction.setItem(item);
        transaction.setWallet(wallet);
        transaction.setDate(transactionRequest.getDate());
        transaction.setBalance(transactionRequest.getBalance());
        transactionRepository.save(transaction);
        return transaction;
    }
    public void deleteTransactionById(Long transactionId){

        transactionRepository.deleteById(transactionId);


    }

}
