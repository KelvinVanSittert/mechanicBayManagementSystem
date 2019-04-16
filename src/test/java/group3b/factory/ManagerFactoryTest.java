package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.Manager;

import static org.junit.Assert.*;

public class ManagerFactoryTest {

    @Test
    public void getManager() {

        String name = "ADP 3";
        Manager manager = ManagerFactory.getManager(name);
        System.out.println(manager);
        Assert.assertNotNull(manager.getManagerId());

    }
}