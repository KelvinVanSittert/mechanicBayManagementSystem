package group3b.service;
import group3b.domain.Car;

public interface CarService extends IService<Car, String>{

    Car create(Car car);

}
