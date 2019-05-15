package group3b.service.impl;

import group3b.domain.SeniorMechanic;
import group3b.factory.SeniorMechanicFactory;
import group3b.repository.SeniorMechanicRepository;
import group3b.repository.impl.SeniorMechanicRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class SeniorMechanicServiceImplTest {
    private SeniorMechanicRepository repository;
    private SeniorMechanic seniorMechanic;

    private SeniorMechanic getSavedSeniorMechanic(){
        Set<SeniorMechanic> savedSeniorMechanics = this.repository.getAll();
        return savedSeniorMechanics.iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.repository = SeniorMechanicRepositoryImpl.getRepository();
        this.seniorMechanic = SeniorMechanicFactory.getSeniorMechanic("Test SeniorMechanic");
    }

    @Test
    public void create() {

        SeniorMechanic testCreate = this.repository.create(this.seniorMechanic);
        Assert.assertSame(testCreate, this.seniorMechanic);

    }

    @Test
    public void delete() {

        int startingSize = this.repository.getAll().size();
        SeniorMechanic savedSeniorMechanic = getSavedSeniorMechanic();
        this.repository.delete(savedSeniorMechanic.getSeniorMechanicId());

        Assert.assertEquals(startingSize-1,this.repository.getAll().size());

        //Create another seniorMechanic after deleting so that Read() has something to read.
        this.repository.create(this.seniorMechanic);

    }

    @Test
    public void read() {

        SeniorMechanic savedSeniorMechanic = getSavedSeniorMechanic();
        String id = savedSeniorMechanic.getSeniorMechanicId();
        SeniorMechanic readSeniorMechanic = this.repository.read(id);
        Assert.assertEquals(savedSeniorMechanic, readSeniorMechanic);
    }

    @Test
    public void update() {

        SeniorMechanic saved = getSavedSeniorMechanic();
        String id = saved.getSeniorMechanicId();
        String newName = "Hello";
        saved.setName(newName);
        this.repository.update(saved);

        Assert.assertEquals(newName,this.repository.read(id).getName());

    }

    @Test
    public void getAll() {

        Set<SeniorMechanic> all = this.repository.getAll();
        Assert.assertNotNull(all);

    }
}