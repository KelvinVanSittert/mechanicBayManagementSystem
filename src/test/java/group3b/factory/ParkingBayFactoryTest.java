package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.ParkingBay;

import static org.junit.Assert.*;

public class ParkingBayFactoryTest {

    @Test
    public void getParkingBay() {

        String name = "ADP 3";
        ParkingBay parkingBay = ParkingBayFactory.getParkingBay(name);
        System.out.println(parkingBay);
        Assert.assertNotNull(parkingBay.getParkingId());

    }
}