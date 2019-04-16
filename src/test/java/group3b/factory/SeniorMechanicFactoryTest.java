package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.SeniorMechanic;

import static org.junit.Assert.*;

public class SeniorMechanicFactoryTest {

    @Test
    public void getSeniorMechanic() {

        String name = "ADP 3";
        SeniorMechanic seniorMechanic = SeniorMechanicFactory.getSeniorMechanic(name);
        System.out.println(seniorMechanic);
        Assert.assertNotNull(seniorMechanic.getSeniorMechanicId());

    }
}