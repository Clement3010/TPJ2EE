package tp.m09.tp1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.m09.tp1.model.Vehicule;
import tp.m09.tp1.repository.VehiculeRepository;

@Service
public class VehiculeService {

    @Autowired
    private VehiculeRepository vehiculeRepository;

    public Iterable<Vehicule> getVehicules() {
        return vehiculeRepository.findAll();
    }

    public void save(Vehicule v){
        vehiculeRepository.save(v);
    }
}
