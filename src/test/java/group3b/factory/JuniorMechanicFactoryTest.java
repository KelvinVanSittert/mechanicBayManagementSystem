package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.JuniorMechanic;

import static org.junit.Assert.*;

public class JuniorMechanicFactoryTest {

    //Create
    @Test
    public void getJuniorMechanic() {

        String name = "ADP 3";
        JuniorMechanic juniorMechanic = JuniorMechanicFactory.getJuniorMechanic(name);
        System.out.println(juniorMechanic);
        Assert.assertNotNull(juniorMechanic.getJuniorMechanicId());

    }

    //Read
    @Test
    public void getName() {

        String name = "ADP 3";
        JuniorMechanic juniorMechanic = JuniorMechanicFactory.getJuniorMechanic(name);
        System.out.println(juniorMechanic);
        Assert.assertEquals("ADP 3", juniorMechanic.getName());
    }

    //Update
    @Test
    public void updateJuniorMechanic() {

        String name ="ADP 3";
        JuniorMechanic juniorMechanic = JuniorMechanicFactory.getJuniorMechanic(name);
        juniorMechanic.setName("Fun");
        System.out.println(juniorMechanic);
        Assert.assertEquals("Fun", juniorMechanic.getName());
    }

    //Delete
    @Test
    public void deleteJuniorMechanic() {

        String name = "ADP 3";
        JuniorMechanic juniorMechanic = JuniorMechanicFactory.getJuniorMechanic(name);
        juniorMechanic = null;
        System.out.println(juniorMechanic);
        Assert.assertNull(juniorMechanic);
    }
}