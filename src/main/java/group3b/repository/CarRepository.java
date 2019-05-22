package group3b.repository;

import group3b.domain.Car;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CarRepository extends IRepository<Car, String>{

    Set<Car> getAll();

}