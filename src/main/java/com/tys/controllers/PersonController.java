package com.tys.controllers;

import com.tys.Request.PersonRequest;
import com.tys.entities.Person;
import com.tys.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/create-person")
    public  String createPerson(@RequestBody PersonRequest personRequest){
        personService.createPerson(personRequest);
        return "person";
    }

}
