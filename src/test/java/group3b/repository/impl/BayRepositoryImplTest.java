package group3b.repository.impl;

import org.junit.Test;

import static org.junit.Assert.*;
import group3b.domain.Bay;
import group3b.factory.BayFactory;
import group3b.repository.BayRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.DEFAULT)

public class BayRepositoryImplTest {

    private BayRepository repository;
    private Bay bay;

    private Bay getSavedBay(){
        Set<Bay> savedBays = this.repository.getAll();
        return savedBays.iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.repository = BayRepositoryImpl.getRepository();
        this.bay = BayFactory.getBay("Test Bay");
    }

    @Test
    public void create() {

        Bay testCreate = this.repository.create(this.bay);
        Assert.assertSame(testCreate, this.bay);

    }

    @Test
    public void delete() {

        int startingSize = this.repository.getAll().size();
        Bay savedBay = getSavedBay();
        this.repository.delete(savedBay.getBayId());

        Assert.assertEquals(startingSize-1,this.repository.getAll().size());

        //Create another bay after deleting so that Read() has something to read.
        this.repository.create(this.bay);

    }

    @Test
    public void read() {

        Bay savedBay = getSavedBay();
        String id = savedBay.getBayId();
        Bay readBay = this.repository.read(id);
        Assert.assertEquals(savedBay, readBay);
    }

    @Test
    public void update() {

        Bay saved = getSavedBay();
        String id = saved.getBayId();
        String newName = "Hello";
        saved.setName(newName);
        this.repository.update(saved);

        Assert.assertEquals(newName,this.repository.read(id).getName());

    }

    @Test
    public void getAll() {

        Set<Bay> all = this.repository.getAll();
        Assert.assertNotNull(all);

    }
}