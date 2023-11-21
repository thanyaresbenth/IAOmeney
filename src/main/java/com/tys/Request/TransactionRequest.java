package com.tys.Request;

import lombok.Data;

import java.util.Date;
@Data
public class TransactionRequest {
    private Double balance;
    private Date date;
    private Long itemId;
    private Long walletId;
    private Long transactionId;
}
