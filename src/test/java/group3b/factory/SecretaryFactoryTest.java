package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.Secretary;

import static org.junit.Assert.*;

public class SecretaryFactoryTest {

    //Create
    @Test
    public void getSecretary() {

        String name = "ADP 3";
        Secretary secretary = SecretaryFactory.getSecretary(name);
        System.out.println(secretary);
        Assert.assertNotNull(secretary.getSecretaryId());

    }

    //Read
    @Test
    public void getName() {

        String name = "ADP 3";
        Secretary secretary = SecretaryFactory.getSecretary(name);
        System.out.println(secretary);
        Assert.assertEquals("ADP 3", secretary.getName());
    }

    //Update
    @Test
    public void updateSecretary() {

        String name ="ADP 3";
        Secretary secretary = SecretaryFactory.getSecretary(name);
        secretary.setName("Fun");
        System.out.println(secretary);
        Assert.assertEquals("Fun", secretary.getName());
    }

    //Delete
    @Test
    public void deleteSecretary() {

        String name = "ADP 3";
        Secretary secretary = SecretaryFactory.getSecretary(name);
        secretary = null;
        System.out.println(secretary);
        Assert.assertNull(secretary);
    }
}