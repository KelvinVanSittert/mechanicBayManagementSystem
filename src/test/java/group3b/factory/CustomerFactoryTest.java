package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.Customer;

import static org.junit.Assert.*;

public class CustomerFactoryTest {

    @Test
    public void getCustomer() {

        String name = "ADP 3";
        Customer customer = CustomerFactory.getCustomer(name);
        System.out.println(customer);
        Assert.assertNotNull(customer.getCustomerId());

    }
}