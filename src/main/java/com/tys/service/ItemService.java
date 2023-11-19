package com.tys.service;

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
}
