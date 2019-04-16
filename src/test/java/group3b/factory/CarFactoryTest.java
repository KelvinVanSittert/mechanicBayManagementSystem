package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.Car;

import static org.junit.Assert.*;

public class CarFactoryTest {

    @Test
    public void getCar() {

        String name = "ADP 3";
        Car car = CarFactory.getCar(name);
        System.out.println(car);
        Assert.assertNotNull(car.getCarId());

    }
}