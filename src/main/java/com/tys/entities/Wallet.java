package com.tys.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="wallet")
@Data
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long walletId;

    @Column
    private Double balance;

    @OneToOne
    @JoinColumn(name="person_id")
    private Person person;
}
