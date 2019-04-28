package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.ParkingBay;

import static org.junit.Assert.*;

public class ParkingBayFactoryTest {

    //Create
    @Test
    public void getParkingBay() {

        String name = "ADP 3";
        ParkingBay parkingBay = ParkingBayFactory.getParkingBay(name);
        System.out.println(parkingBay);
        Assert.assertNotNull(parkingBay.getParkingBayId());

    }

    //Read
    @Test
    public void getName() {

        String name = "ADP 3";
        ParkingBay parkingBay = ParkingBayFactory.getParkingBay(name);
        System.out.println(parkingBay);
        Assert.assertEquals("ADP 3", parkingBay.getName());
    }

    //Update
    @Test
    public void updateParkingBay() {

        String name ="ADP 3";
        ParkingBay parkingBay = ParkingBayFactory.getParkingBay(name);
        parkingBay.setName("Fun");
        System.out.println(parkingBay);
        Assert.assertEquals("Fun", parkingBay.getName());
    }

    //Delete
    @Test
    public void deleteParkingBay() {

        String name = "ADP 3";
        ParkingBay parkingBay = ParkingBayFactory.getParkingBay(name);
        parkingBay = null;
        System.out.println(parkingBay);
        Assert.assertNull(parkingBay);
    }
}