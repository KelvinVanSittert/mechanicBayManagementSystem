package group3b.service.impl;

import group3b.domain.Car;
import group3b.repository.CarRepository;
import group3b.repository.impl.CarRepositoryImpl;
import group3b.service.CarService;

import java.util.Set;

public class CarServiceImpl implements CarService {

    private CarServiceImpl service = null;
    private CarRepository repository;

    private CarServiceImpl(){
        this.repository = CarRepositoryImpl.getRepository();
    }

    public CarService getService(){
        if (service == null) service = new CarServiceImpl();
        return service;
    }

    @Override
    public Car create(Car car) {
        return this.repository.create(car);
    }

    @Override
    public Car update(Car car) {
        return this.repository.update(car);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Car read(String s) {
        return this.repository.read(s);
    }

}