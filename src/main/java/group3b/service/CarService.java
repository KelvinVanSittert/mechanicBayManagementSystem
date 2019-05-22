package group3b.service;
import group3b.domain.Car;

import java.util.Set;

public interface CarService extends IService<Car, String>{

    Set<Car> getAll();

}
