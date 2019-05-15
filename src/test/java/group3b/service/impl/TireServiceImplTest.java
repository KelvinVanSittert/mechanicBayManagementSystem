package group3b.service.impl;

import group3b.domain.Tire;
import group3b.factory.TireFactory;
import group3b.repository.TireRepository;
import group3b.repository.impl.TireRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class TireServiceImplTest {
    private TireRepository repository;
    private Tire tire;

    private Tire getSavedTire(){
        Set<Tire> savedTires = this.repository.getAll();
        return savedTires.iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.repository = TireRepositoryImpl.getRepository();
        this.tire = TireFactory.getTire("Test Tire");
    }

    @Test
    public void create() {

        Tire testCreate = this.repository.create(this.tire);
        Assert.assertSame(testCreate, this.tire);

    }

    @Test
    public void delete() {

        int startingSize = this.repository.getAll().size();
        Tire savedTire = getSavedTire();
        this.repository.delete(savedTire.getTireId());

        Assert.assertEquals(startingSize-1,this.repository.getAll().size());

        //Create another tire after deleting so that Read() has something to read.
        this.repository.create(this.tire);

    }

    @Test
    public void read() {

        Tire savedTire = getSavedTire();
        String id = savedTire.getTireId();
        Tire readTire = this.repository.read(id);
        Assert.assertEquals(savedTire, readTire);
    }

    @Test
    public void update() {

        Tire saved = getSavedTire();
        String id = saved.getTireId();
        String newName = "Hello";
        saved.setName(newName);
        this.repository.update(saved);

        Assert.assertEquals(newName,this.repository.read(id).getName());

    }

    @Test
    public void getAll() {

        Set<Tire> all = this.repository.getAll();
        Assert.assertNotNull(all);

    }
}