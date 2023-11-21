package com.tys.controllers;

import com.tys.Request.ItemRequest;
import com.tys.entities.Item;
import com.tys.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/item-find-by-id")
    public Item getItemByItem(@RequestParam Long itemId){
       Item item = itemService.findById(itemId);
       return item;
    }
    @PostMapping("/createItem")
    public String createItem(@RequestBody ItemRequest itemRequest){
        itemService.createItem(itemRequest);
        return "item";
    }
    @PostMapping("/update-item")
    public String updateItem(@RequestBody ItemRequest itemRequest) {
        itemService.updateItem(itemRequest);
        return "item";

    }
    @PostMapping("/delete-item")
    public String deleteItemId(@RequestBody ItemRequest itemRequest){
        itemService.deleteItemById(itemRequest.getItemId());

        return "item";
    }
}
