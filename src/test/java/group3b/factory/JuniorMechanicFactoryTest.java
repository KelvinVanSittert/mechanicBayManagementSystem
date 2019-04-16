package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.JuniorMechanic;

import static org.junit.Assert.*;

public class JuniorMechanicFactoryTest {

    @Test
    public void getJuniorMechanic() {

        String name = "ADP 3";
        JuniorMechanic juniorMechanic = JuniorMechanicFactory.getJuniorMechanic(name);
        System.out.println(juniorMechanic);
        Assert.assertNotNull(juniorMechanic.getJuniorMechanicId());

    }
}