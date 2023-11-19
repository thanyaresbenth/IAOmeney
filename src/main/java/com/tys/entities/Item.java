package com.tys.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "item")
@Data
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    @Column
    private String itemName;

    @Column
    private String itemType;

    @Column
    private Double amount;

}
