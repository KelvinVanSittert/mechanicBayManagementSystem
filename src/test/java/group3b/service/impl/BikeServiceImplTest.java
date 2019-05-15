package group3b.service.impl;

import group3b.domain.Bike;
import group3b.factory.BikeFactory;
import group3b.repository.BikeRepository;
import group3b.repository.impl.BikeRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.DEFAULT)

public class BikeServiceImplTest {

    private BikeRepository repository;
    private Bike bike;

    private Bike getSavedBike(){
        Set<Bike> savedBikes = this.repository.getAll();
        return savedBikes.iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.repository = BikeRepositoryImpl.getRepository();
        this.bike = BikeFactory.getBike("Test Bike");
    }

    @Test
    public void create() {

        Bike testCreate = this.repository.create(this.bike);
        Assert.assertSame(testCreate, this.bike);

    }

    @Test
    public void delete() {

        int startingSize = this.repository.getAll().size();
        Bike savedBike = getSavedBike();
        this.repository.delete(savedBike.getBikeId());

        Assert.assertEquals(startingSize-1,this.repository.getAll().size());

        //Create another bike after deleting so that Read() has something to read.
        this.repository.create(this.bike);

    }

    @Test
    public void read() {

        Bike savedBike = getSavedBike();
        String id = savedBike.getBikeId();
        Bike readBike = this.repository.read(id);
        Assert.assertEquals(savedBike, readBike);
    }

    @Test
    public void update() {

        Bike saved = getSavedBike();
        String id = saved.getBikeId();
        String newName = "Hello";
        saved.setName(newName);
        this.repository.update(saved);

        Assert.assertEquals(newName,this.repository.read(id).getName());

    }

    @Test
    public void getAll() {

        Set<Bike> all = this.repository.getAll();
        Assert.assertNotNull(all);

    }
}