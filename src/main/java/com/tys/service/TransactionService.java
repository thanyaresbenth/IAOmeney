package com.tys.service;

import com.tys.entities.Transaction;
import com.tys.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    public TransactionRepository transactionRepository;

    public List<Transaction>findAll(){
        List<Transaction> listTransaction = transactionRepository.findAll();
        return listTransaction;

    }
    public Transaction findById(Long transactionId){
        Transaction transaction = transactionRepository.findById(transactionId).orElse(null);
        return transaction;
    }
}
