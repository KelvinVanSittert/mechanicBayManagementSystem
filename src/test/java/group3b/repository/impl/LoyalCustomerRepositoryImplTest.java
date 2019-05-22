package group3b.repository.impl;

import org.junit.Test;

import static org.junit.Assert.*;
import group3b.domain.LoyalCustomer;
import group3b.factory.LoyalCustomerFactory;
import group3b.repository.LoyalCustomerRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

@FixMethodOrder(MethodSorters.DEFAULT)

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)

public class LoyalCustomerRepositoryImplTest {

    @Autowired
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