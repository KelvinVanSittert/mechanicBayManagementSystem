package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.TraineeMechanic;

import static org.junit.Assert.*;

public class TraineeMechanicFactoryTest {

    //Create
    @Test
    public void getTraineeMechanic() {

        String name = "ADP 3";
        TraineeMechanic traineeMechanic = TraineeMechanicFactory.getTraineeMechanic(name);
        System.out.println(traineeMechanic);
        Assert.assertNotNull(traineeMechanic.getTraineeMechanicId());

    }

    //Read
    @Test
    public void getName() {

        String name = "ADP 3";
        TraineeMechanic traineeMechanic = TraineeMechanicFactory.getTraineeMechanic(name);
        System.out.println(traineeMechanic);
        Assert.assertEquals("ADP 3", traineeMechanic.getName());
    }

    //Update
    @Test
    public void updateTraineeMechanic() {

        String name ="ADP 3";
        TraineeMechanic traineeMechanic = TraineeMechanicFactory.getTraineeMechanic(name);
        traineeMechanic.setName("Fun");
        System.out.println(traineeMechanic);
        Assert.assertEquals("Fun", traineeMechanic.getName());
    }

    //Delete
    @Test
    public void deleteTraineeMechanic() {

        String name = "ADP 3";
        TraineeMechanic traineeMechanic = TraineeMechanicFactory.getTraineeMechanic(name);
        traineeMechanic = null;
        System.out.println(traineeMechanic);
        Assert.assertNull(traineeMechanic);
    }
}