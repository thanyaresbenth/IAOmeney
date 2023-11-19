package com.tys.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @GetMapping("/myAccount")
    public String myAccount(){
        return "uuid";
    }
}
