package tp.m09.tp1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.m09.tp1.model.Person;
import tp.m09.tp1.model.Rent;
import tp.m09.tp1.repository.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Iterable<Person> getPersons(){
        return  personRepository.findAll();
    }

    public void save(Person p){
        personRepository.save(p);
    }

    public void addRent(Integer personId, Rent r){
        Person p = personRepository.findById(personId).get();
        r.setPerson(p);
        p.addRent(r);
        personRepository.save(p);
    }

}
