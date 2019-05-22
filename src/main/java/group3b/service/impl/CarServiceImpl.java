package group3b.service.impl;

import group3b.domain.Car;
import group3b.repository.CarRepository;
import group3b.repository.impl.CarRepositoryImpl;
import group3b.service.CarService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CarServiceImpl implements CarService {

    @Qualifier("InMemory")
    private static CarServiceImpl service = null;
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

    @Override
    public Set<Car> getAll() {
        return repository.getAll();
    }

}