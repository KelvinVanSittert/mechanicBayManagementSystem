package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.Tire;

import static org.junit.Assert.*;

public class TireFactoryTest {

    @Test
    public void getTire() {

        String name = "ADP 3";
        Tire tire = TireFactory.getTire(name);
        System.out.println(tire);
        Assert.assertNotNull(tire.getTireId());

    }
}