package com.tys.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="transition")
@Data
public class Transition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transitionId;

    @ManyToOne
    @JoinColumn(name= "item_id")
    private Item item;

    @Column
    private Double balance;

    @Column
    private Date date;
}
