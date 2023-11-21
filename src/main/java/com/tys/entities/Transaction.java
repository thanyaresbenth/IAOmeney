package com.tys.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="transaction")
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @ManyToOne
    @JoinColumn(name= "item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name= "wallet_id")
    private Wallet wallet;

    @Column
    private Double balance;

    @Column
    private Date date;
}
