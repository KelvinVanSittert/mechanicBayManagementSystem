package group3b.service.impl;

import group3b.domain.Car;
import group3b.factory.CarFactory;
import group3b.repository.CarRepository;
import group3b.repository.impl.CarRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class CarServiceImplTest {
    private CarRepository repository;
    private Car car;

    private Car getSavedCar(){
        Set<Car> savedCars = this.repository.getAll();
        return savedCars.iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.repository = CarRepositoryImpl.getRepository();
        this.car = CarFactory.getCar("Test Car");
    }

    @Test
    public void create() {

        Car testCreate = this.repository.create(this.car);
        Assert.assertSame(testCreate, this.car);

    }

    @Test
    public void delete() {

        int startingSize = this.repository.getAll().size();
        Car savedCar = getSavedCar();
        this.repository.delete(savedCar.getCarId());

        Assert.assertEquals(startingSize-1,this.repository.getAll().size());

        //Create another car after deleting so that Read() has something to read.
        this.repository.create(this.car);

    }

    @Test
    public void read() {

        Car savedCar = getSavedCar();
        String id = savedCar.getCarId();
        Car readCar = this.repository.read(id);
        Assert.assertEquals(savedCar, readCar);
    }

    @Test
    public void update() {

        Car saved = getSavedCar();
        String id = saved.getCarId();
        String newName = "Hello";
        saved.setName(newName);
        this.repository.update(saved);

        Assert.assertEquals(newName,this.repository.read(id).getName());

    }

    @Test
    public void getAll() {

        Set<Car> all = this.repository.getAll();
        Assert.assertNotNull(all);

    }
}