package com.tys.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="person")
@Data
public class Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personId;

    @Column
    private String uuid;

//    public void setUuid(String uuid) {
//        this.uuid = uuid;
//    }
//    public String getUuid(){
//        return this.uuid;
//    }
}
