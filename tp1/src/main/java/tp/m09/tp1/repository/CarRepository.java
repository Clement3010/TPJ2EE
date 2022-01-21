package tp.m09.tp1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tp.m09.tp1.model.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, String> {

}
