package group3b.repository;

import group3b.domain.Car;

import java.util.Set;


public interface CarRepository extends IRepository<Car, String>{

    Set<Car> getAll();

}