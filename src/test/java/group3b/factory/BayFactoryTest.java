package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.Bay;

import static org.junit.Assert.*;

public class BayFactoryTest {

    @Test
    public void getBay() {

        String name = "ADP 3";
        Bay bay = BayFactory.getBay(name);
        System.out.println(bay);
        Assert.assertNotNull(bay.getBayId());

    }
}