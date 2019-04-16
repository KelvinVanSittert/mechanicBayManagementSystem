package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.Mechanic;

import static org.junit.Assert.*;

public class MechanicFactoryTest {

    @Test
    public void getMechanic() {

        String name = "ADP 3";
        Mechanic mechanic = MechanicFactory.getMechanic(name);
        System.out.println(mechanic);
        Assert.assertNotNull(mechanic.getMechanicId());

    }
}