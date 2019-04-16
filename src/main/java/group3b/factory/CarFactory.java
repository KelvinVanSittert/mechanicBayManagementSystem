package group3b.factory;

import group3b.domain.Car;
import group3b.util.Misc;

public class CarFactory {
    public static Car getCar(String carName) {
        return new Car.Builder().carId(Misc.generateId())
                .name(carName)
                .build();
    }

}