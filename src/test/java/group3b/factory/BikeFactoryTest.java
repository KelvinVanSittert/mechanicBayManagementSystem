package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.Bike;

import static org.junit.Assert.*;

public class BikeFactoryTest {

    @Test
    public void getBike() {

        String name = "ADP 3";
        Bike bike = BikeFactory.getBike(name);
        System.out.println(bike);
        Assert.assertNotNull(bike.getBikeId());

    }
}