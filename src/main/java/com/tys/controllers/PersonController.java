package com.tys.controllers;

import com.tys.entities.Person;
import com.tys.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;


    @GetMapping("/find-allPerson")
    public List<Person>findAll(){
        List<Person>  listPerson =personService.findAll();
        return listPerson;
    }
    @GetMapping("/person-find-by-id")
    public Person getById(@RequestParam Long personId){
        Person person = personService.findById(personId);
        return person;
    }

    @GetMapping("/myAccount")
    public String myAccount(){
        return "uuid";
    }

}
