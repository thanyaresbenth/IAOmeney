package com.tys.service;

import com.tys.Request.PersonRequest;
import com.tys.entities.Person;
import com.tys.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll(){
        List<Person> listPerson = personRepository.findAll();
        return listPerson;

    }
    public Person findById(Long personId ){
        Person person = personRepository.findById(personId).orElse(null);
        return person;
    }

    public Person createPerson(PersonRequest personRequest){
        Person person =new Person();
        person.setUuid(personRequest.getUuid());
        personRepository.save(person);
        return person;

    }
    public Person updatePerson(PersonRequest personRequest){
        Long personId = personRequest.getPersonId();
        Person person = personRepository.findById(personId).orElse(null);
        person.setUuid(personRequest.getUuid());
        personRepository.save(person);
        return person;
    }
    public  void deletePersonById(Long personId){
        personRepository.deleteById(personId);
    }

}
