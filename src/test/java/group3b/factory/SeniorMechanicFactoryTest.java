package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.SeniorMechanic;

import static org.junit.Assert.*;

public class SeniorMechanicFactoryTest {

    //Create
    @Test
    public void getSeniorMechanic() {

        String name = "ADP 3";
        SeniorMechanic seniorMechanic = SeniorMechanicFactory.getSeniorMechanic(name);
        System.out.println(seniorMechanic);
        Assert.assertNotNull(seniorMechanic.getSeniorMechanicId());

    }

    //Read
    @Test
    public void getName() {

        String name = "ADP 3";
        SeniorMechanic seniorMechanic = SeniorMechanicFactory.getSeniorMechanic(name);
        System.out.println(seniorMechanic);
        Assert.assertEquals("ADP 3", seniorMechanic.getName());
    }

    //Update
    @Test
    public void updateSeniorMechanic() {

        String name ="ADP 3";
        SeniorMechanic seniorMechanic = SeniorMechanicFactory.getSeniorMechanic(name);
        seniorMechanic.setName("Fun");
        System.out.println(seniorMechanic);
        Assert.assertEquals("Fun", seniorMechanic.getName());
    }

    //Delete
    @Test
    public void deleteSeniorMechanic() {

        String name = "ADP 3";
        SeniorMechanic seniorMechanic = SeniorMechanicFactory.getSeniorMechanic(name);
        seniorMechanic = null;
        System.out.println(seniorMechanic);
        Assert.assertNull(seniorMechanic);
    }
}