package com.tys.controllers;

import com.tys.entities.Transaction;
import com.tys.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
   @Autowired
   private TransactionService transactionService;

   @GetMapping("/find-AllTransaction")
   public List<Transaction>findAll(){
      List<Transaction> listTransaction = transactionService.findAll();
      return listTransaction;
   }
   @GetMapping("/trans-find-by-id")
   public Transaction getById(@RequestParam Long transactionId){
      Transaction transaction = transactionService.findById(transactionId);
      return transaction;
   }

}
