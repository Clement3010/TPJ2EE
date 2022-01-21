package tp.m09.tp1.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="person_id")
    private Integer id;

    @Column(name="name")
    private String name;

    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn(name = "rent_id")
    private List<Rent> rentals = new ArrayList<>();

    public Person() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Rent> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rent> rentals) {
        this.rentals = rentals;
    }

    public void addRent(Rent r){
        rentals.add(r);
    }
}
