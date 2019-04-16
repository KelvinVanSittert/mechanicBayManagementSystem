package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.Secretary;

import static org.junit.Assert.*;

public class SecretaryFactoryTest {

    @Test
    public void getSecretary() {

        String name = "ADP 3";
        Secretary secretary = SecretaryFactory.getSecretary(name);
        System.out.println(secretary);
        Assert.assertNotNull(secretary.getSecretaryId());

    }
}