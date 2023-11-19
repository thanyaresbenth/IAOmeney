package com.tys.controllers;

import com.tys.entities.Item;
import com.tys.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/test")
    public String test(){
        itemService.test();


        System.out.println("test hello");

        return "success";
    }
    @GetMapping("/find-all")
    public List<Item> findAll(){
        List<Item> listItem = itemService.findAll();
        return listItem;

    }

}
