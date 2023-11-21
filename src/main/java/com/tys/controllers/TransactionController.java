package com.tys.controllers;

import com.tys.Request.TransactionRequest;
import com.tys.entities.Transaction;
import com.tys.service.ItemService;
import com.tys.service.TransactionService;
import com.tys.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
   @Autowired
   private WalletService walletService;
   @Autowired
   private ItemService itemService;

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
   @PostMapping("/create-transaction")
   public String createTransaction(@RequestBody TransactionRequest transactionRequest){
      transactionService.createTransaction(transactionRequest);
      return "transaction";
   }

}
