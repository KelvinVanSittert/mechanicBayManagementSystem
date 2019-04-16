package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.LoyalCustomer;

import static org.junit.Assert.*;

public class LoyalCustomerFactoryTest {

    @Test
    public void getLoyalCustomer() {

        String name = "ADP 3";
        LoyalCustomer loyalCustomer = LoyalCustomerFactory.getLoyalCustomer(name);
        System.out.println(loyalCustomer);
        Assert.assertNotNull(loyalCustomer.getLoyalCustomerId());

    }
}