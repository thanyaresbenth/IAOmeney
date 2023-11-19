package com.tys.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {

    @GetMapping("/test")
    public String test(){



        System.out.println("test hello");

        return "success";
    }

}
