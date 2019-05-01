package group3b.repository.impl;

import org.junit.Test;

import static org.junit.Assert.*;
import group3b.domain.TraineeMechanic;
import group3b.factory.TraineeMechanicFactory;
import group3b.repository.TraineeMechanicRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.DEFAULT)

public class TraineeMechanicRepositoryImplTest {

    private TraineeMechanicRepository repository;
    private TraineeMechanic traineeMechanic;

    private TraineeMechanic getSavedTraineeMechanic(){
        Set<TraineeMechanic> savedTraineeMechanics = this.repository.getAll();
        return savedTraineeMechanics.iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.repository = TraineeMechanicRepositoryImpl.getRepository();
        this.traineeMechanic = TraineeMechanicFactory.getTraineeMechanic("Test TraineeMechanic");
    }

    @Test
    public void create() {

        TraineeMechanic testCreate = this.repository.create(this.traineeMechanic);
        Assert.assertSame(testCreate, this.traineeMechanic);

    }

    @Test
    public void delete() {

        int startingSize = this.repository.getAll().size();
        TraineeMechanic savedTraineeMechanic = getSavedTraineeMechanic();
        this.repository.delete(savedTraineeMechanic.getTraineeMechanicId());

        Assert.assertEquals(startingSize-1,this.repository.getAll().size());

        //Create another traineeMechanic after deleting so that Read() has something to read.
        this.repository.create(this.traineeMechanic);

    }

    @Test
    public void read() {

        TraineeMechanic savedTraineeMechanic = getSavedTraineeMechanic();
        String id = savedTraineeMechanic.getTraineeMechanicId();
        TraineeMechanic readTraineeMechanic = this.repository.read(id);
        Assert.assertEquals(savedTraineeMechanic, readTraineeMechanic);
    }

    @Test
    public void update() {

        TraineeMechanic saved = getSavedTraineeMechanic();
        String id = saved.getTraineeMechanicId();
        String newName = "Hello";
        saved.setName(newName);
        this.repository.update(saved);

        Assert.assertEquals(newName,this.repository.read(id).getName());

    }

    @Test
    public void getAll() {

        Set<TraineeMechanic> all = this.repository.getAll();
        Assert.assertNotNull(all);

    }
}