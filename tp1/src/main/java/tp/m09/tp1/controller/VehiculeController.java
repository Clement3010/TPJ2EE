package tp.m09.tp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tp.m09.tp1.model.Vehicule;
import tp.m09.tp1.service.VehiculeService;

@RestController
public class VehiculeController {

    @Autowired
    private VehiculeService vehiculeService;

    @GetMapping("/vehicules")
    public Iterable<Vehicule> getVehicules() {
        return vehiculeService.getVehicules();
    }

    @PostMapping("/vehicule/new")
    public void newVehicule(@RequestBody Vehicule v) {
        vehiculeService.save(v);
    }
}
