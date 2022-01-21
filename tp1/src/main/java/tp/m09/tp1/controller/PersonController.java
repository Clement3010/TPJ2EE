package tp.m09.tp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tp.m09.tp1.model.Car;
import tp.m09.tp1.model.Person;
import tp.m09.tp1.model.Rent;
import tp.m09.tp1.model.RentDate;
import tp.m09.tp1.service.CarService;
import tp.m09.tp1.service.PersonService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @Autowired
    private CarService carService;

    @GetMapping("/persons")
    public Iterable<Person> getPersons() {
        return personService.getPersons();
    }

    @PostMapping("/person/new")
    public void newPerson(@RequestBody Person p){
        personService.save(p);
    }

    @PostMapping("/person/{personId}/{plateNumber}")
    public void addRent(@PathVariable("personId") Integer personId, @PathVariable("plateNumber") String plateNumber, @RequestBody RentDate dates) {
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date begin_date = null;
        Date end_date= null;
        try {
            begin_date = simpleDateFormat.parse(dates.getBegin_date());
            end_date = simpleDateFormat.parse(dates.getEnd_date());
        } catch (ParseException e) {
        }

        Rent r = new Rent();
        r.setBeginRent(begin_date);
        r.setEndRent(end_date);

        Car c = carService.getCar(plateNumber).get();
        r.setCar(c);
        c.addRent(r);

        personService.addRent(personId, r);
    }
}
