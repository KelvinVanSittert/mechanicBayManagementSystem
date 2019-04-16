package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.MechanicBay;

import static org.junit.Assert.*;

public class MechanicBayFactoryTest {

    @Test
    public void getMechanicBay() {

        String name = "ADP 3";
        MechanicBay mechanicBay = MechanicBayFactory.getMechanicBay(name);
        System.out.println(mechanicBay);
        Assert.assertNotNull(mechanicBay.getMechanicBayId());

    }
}