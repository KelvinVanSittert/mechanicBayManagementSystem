package group3b.service.impl;

import group3b.domain.Truck;
import group3b.factory.TruckFactory;
import group3b.repository.TruckRepository;
import group3b.repository.impl.TruckRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class TruckServiceImplTest {
    private TruckRepository repository;
    private Truck truck;

    private Truck getSavedTruck(){
        Set<Truck> savedTrucks = this.repository.getAll();
        return savedTrucks.iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.repository = TruckRepositoryImpl.getRepository();
        this.truck = TruckFactory.getTruck("Test Truck");
    }

    @Test
    public void create() {

        Truck testCreate = this.repository.create(this.truck);
        Assert.assertSame(testCreate, this.truck);

    }

    @Test
    public void delete() {

        int startingSize = this.repository.getAll().size();
        Truck savedTruck = getSavedTruck();
        this.repository.delete(savedTruck.getTruckId());

        Assert.assertEquals(startingSize-1,this.repository.getAll().size());

        //Create another truck after deleting so that Read() has something to read.
        this.repository.create(this.truck);

    }

    @Test
    public void read() {

        Truck savedTruck = getSavedTruck();
        String id = savedTruck.getTruckId();
        Truck readTruck = this.repository.read(id);
        Assert.assertEquals(savedTruck, readTruck);
    }

    @Test
    public void update() {

        Truck saved = getSavedTruck();
        String id = saved.getTruckId();
        String newName = "Hello";
        saved.setName(newName);
        this.repository.update(saved);

        Assert.assertEquals(newName,this.repository.read(id).getName());

    }

    @Test
    public void getAll() {

        Set<Truck> all = this.repository.getAll();
        Assert.assertNotNull(all);

    }
}