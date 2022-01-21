package tp.m09.tp1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.m09.tp1.model.Car;
import tp.m09.tp1.repository.CarRepository;

import java.util.Optional;


@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public Iterable<Car> getCars() {
        return carRepository.findAll();
    }

    public Optional<Car> getCar(String plateNumber){
        return carRepository.findById(plateNumber);
    }

    public void save(Car c){
        carRepository.save(c);
    }

}
