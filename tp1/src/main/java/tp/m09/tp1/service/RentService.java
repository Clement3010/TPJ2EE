package tp.m09.tp1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.m09.tp1.model.Rent;
import tp.m09.tp1.repository.RentRepository;

@Service
public class RentService {

    @Autowired
    private RentRepository rentRepository;

    public void save(Rent r){
        rentRepository.save(r);
    }
}
