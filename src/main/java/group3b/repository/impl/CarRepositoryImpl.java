package group3b.repository.impl;

import group3b.domain.Car;
import group3b.repository.CarRepository;

import java.util.HashSet;
import java.util.Set;

public class CarRepositoryImpl implements CarRepository {

    private static CarRepositoryImpl repository = null;
    private Set<Car> cars;

    private CarRepositoryImpl(){
        this.cars = new HashSet<>();
    }

    public static CarRepositoryImpl getRepository(){
        if (repository == null) repository = new CarRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Car> getAll() {
        return this.cars;
    }

    @Override
    public Car create(Car car) {
        this.cars.add(car);
        return car;
    }

    @Override
    public Car update(Car car) {

        Car[] cloneOfCars = cars.toArray(new Car[cars.size()]);
        for (int i = 0; i<cloneOfCars.length;i++) {
            if (cloneOfCars[i].equals(car)) {
                cars.remove(cloneOfCars[i]);
            }
        }
        return create(car);
    }

    @Override
    public void delete(String carId) {
        Car[] cloneOfCars = cars.toArray(new Car[cars.size()]);
        for (int i = 0; i<cloneOfCars.length;i++) {
            if (cloneOfCars[i].getCarId() == carId) {
                if (cars.contains(cloneOfCars[i])){
                    cars.remove(cloneOfCars[i]);
                }
            }
        }
    }

    @Override
    public Car read(String carId) {

        Car carToReturn = null;

        Car[] cloneOfCars = cars.toArray(new Car[cars.size()]);

        for (int i = 0; i<cloneOfCars.length;i++) {
            if (cloneOfCars[i].getCarId() == carId) {
                carToReturn = cloneOfCars[i];
            }
        }

        return carToReturn;
    }
}
