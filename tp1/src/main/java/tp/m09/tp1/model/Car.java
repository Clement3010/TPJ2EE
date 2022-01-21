package tp.m09.tp1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Car extends Vehicule {

    @Column(name="numberOfSeats")
    private Integer numberOfSeats;

    @OneToMany (cascade = CascadeType.ALL)
    @JsonIgnore
    @OrderColumn(name="rent_id")
    private List<Rent> rentals = new ArrayList<>();

    public Car(){
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
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