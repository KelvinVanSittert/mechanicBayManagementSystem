package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.TraineeMechanic;

import static org.junit.Assert.*;

public class TraineeMechanicFactoryTest {

    @Test
    public void getTraineeMechanic() {

        String name = "ADP 3";
        TraineeMechanic traineeMechanic = TraineeMechanicFactory.getTraineeMechanic(name);
        System.out.println(traineeMechanic);
        Assert.assertNotNull(traineeMechanic.getTraineeMechanicId());

    }
}