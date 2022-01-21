package tp.m09.tp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tp.m09.tp1.model.Car;
import tp.m09.tp1.service.CarService;


@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
        public Iterable<Car> getCars() {
        return carService.getCars();
    }

    @GetMapping("/car/{plateNumber}")
    public Car getCar(@PathVariable("plateNumber") String plateNumber) {
        return carService.getCar(plateNumber).orElseGet(null);
    }

    @PostMapping("/car/new")
    public void newCar(@RequestBody Car c) {
        carService.save(c);
    }
}
