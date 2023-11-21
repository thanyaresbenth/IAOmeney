package com.tys.service;

import com.tys.Request.ItemRequest;
import com.tys.entities.Item;
import com.tys.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    public ItemRepository itemRepository;

    public void test(){

        System.out.println("test");
    }

    public List<Item> findAll(){
        List<Item> listItem = itemRepository.findAll();
        return listItem;
    }
    public Item findById(Long itemId){
        Item item= itemRepository.findById(itemId).orElse(null);
        return item;
    }
    public Item createItem(ItemRequest itemRequest){
        Item item = new Item();
        item.setItemName(itemRequest.getItemName());
        item.setItemType(itemRequest.getItemType());
        item.setAmount(itemRequest.getAmount());
        itemRepository.save(item);
        return item;
    }
}
