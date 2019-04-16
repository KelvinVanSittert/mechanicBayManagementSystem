package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.Truck;

import static org.junit.Assert.*;

public class TruckFactoryTest {

    @Test
    public void getTruck() {

        String name = "ADP 3";
        Truck truck = TruckFactory.getTruck(name);
        System.out.println(truck);
        Assert.assertNotNull(truck.getTruckId());

    }
}