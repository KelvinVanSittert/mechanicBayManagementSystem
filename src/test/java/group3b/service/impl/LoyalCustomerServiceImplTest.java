package group3b.service.impl;

import group3b.domain.LoyalCustomer;
import group3b.factory.LoyalCustomerFactory;
import group3b.repository.LoyalCustomerRepository;
import group3b.repository.impl.LoyalCustomerRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class LoyalCustomerServiceImplTest {

    private LoyalCustomerRepository repository;
    private LoyalCustomer loyalCustomer;

    private LoyalCustomer getSavedLoyalCustomer(){
        Set<LoyalCustomer> savedLoyalCustomers = this.repository.getAll();
        return savedLoyalCustomers.iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.repository = LoyalCustomerRepositoryImpl.getRepository();
        this.loyalCustomer = LoyalCustomerFactory.getLoyalCustomer("Test LoyalCustomer");
    }

    @Test
    public void create() {

        LoyalCustomer testCreate = this.repository.create(this.loyalCustomer);
        Assert.assertSame(testCreate, this.loyalCustomer);

    }

    @Test
    public void delete() {

        int startingSize = this.repository.getAll().size();
        LoyalCustomer savedLoyalCustomer = getSavedLoyalCustomer();
        this.repository.delete(savedLoyalCustomer.getLoyalCustomerId());

        Assert.assertEquals(startingSize-1,this.repository.getAll().size());

        //Create another loyalCustomer after deleting so that Read() has something to read.
        this.repository.create(this.loyalCustomer);

    }

    @Test
    public void read() {

        LoyalCustomer savedLoyalCustomer = getSavedLoyalCustomer();
        String id = savedLoyalCustomer.getLoyalCustomerId();
        LoyalCustomer readLoyalCustomer = this.repository.read(id);
        Assert.assertEquals(savedLoyalCustomer, readLoyalCustomer);
    }

    @Test
    public void update() {

        LoyalCustomer saved = getSavedLoyalCustomer();
        String id = saved.getLoyalCustomerId();
        String newName = "Hello";
        saved.setName(newName);
        this.repository.update(saved);

        Assert.assertEquals(newName,this.repository.read(id).getName());

    }

    @Test
    public void getAll() {

        Set<LoyalCustomer> all = this.repository.getAll();
        Assert.assertNotNull(all);

    }
}