package com.tys.service;

import com.tys.entities.Person;
import com.tys.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService {

    @Autowired
    public PersonRepository personRepository;

    public List<Person> findAll(){
        List<Person> listPerson = personRepository.findAll();
        return listPerson;
    }

}
