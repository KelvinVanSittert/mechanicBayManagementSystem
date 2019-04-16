package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.Vehicle;

import static org.junit.Assert.*;

public class VehicleFactoryTest {

    @Test
    public void getVehicle() {

        String name = "ADP 3";
        Vehicle vehicle = VehicleFactory.getVehicle(name);
        System.out.println(vehicle);
        Assert.assertNotNull(vehicle.getVehicleId());

    }
}