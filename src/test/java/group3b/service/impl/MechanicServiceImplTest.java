package group3b.service.impl;

import group3b.domain.Mechanic;
import group3b.factory.MechanicFactory;
import group3b.repository.MechanicRepository;
import group3b.repository.impl.MechanicRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class MechanicServiceImplTest {

    private MechanicRepository repository;
    private Mechanic mechanic;

    private Mechanic getSavedMechanic(){
        Set<Mechanic> savedMechanics = this.repository.getAll();
        return savedMechanics.iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.repository = MechanicRepositoryImpl.getRepository();
        this.mechanic = MechanicFactory.getMechanic("Test Mechanic");
    }

    @Test
    public void create() {

        Mechanic testCreate = this.repository.create(this.mechanic);
        Assert.assertSame(testCreate, this.mechanic);

    }

    @Test
    public void delete() {

        int startingSize = this.repository.getAll().size();
        Mechanic savedMechanic = getSavedMechanic();
        this.repository.delete(savedMechanic.getMechanicId());

        Assert.assertEquals(startingSize-1,this.repository.getAll().size());

        //Create another mechanic after deleting so that Read() has something to read.
        this.repository.create(this.mechanic);

    }

    @Test
    public void read() {

        Mechanic savedMechanic = getSavedMechanic();
        String id = savedMechanic.getMechanicId();
        Mechanic readMechanic = this.repository.read(id);
        Assert.assertEquals(savedMechanic, readMechanic);
    }

    @Test
    public void update() {

        Mechanic saved = getSavedMechanic();
        String id = saved.getMechanicId();
        String newName = "Hello";
        saved.setName(newName);
        this.repository.update(saved);

        Assert.assertEquals(newName,this.repository.read(id).getName());

    }

    @Test
    public void getAll() {

        Set<Mechanic> all = this.repository.getAll();
        Assert.assertNotNull(all);

    }
}
