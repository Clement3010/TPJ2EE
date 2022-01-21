package tp.m09.tp1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="rent_id")
    private Integer id;

    @Column(name="beginRent")
    private Date beginRent;

    @Column(name="endRent")
    private Date endRent;

    @ManyToOne (cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name = "person_id")
    private Person person;

    @ManyToOne (cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name = "plateNumber")
    private Car car;

    public Rent(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBeginRent() {
        return beginRent;
    }

    public void setBeginRent(Date beginRent) {
        this.beginRent = beginRent;
    }

    public Date getEndRent() {
        return endRent;
    }

    public void setEndRent(Date endRent) {
        this.endRent = endRent;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
