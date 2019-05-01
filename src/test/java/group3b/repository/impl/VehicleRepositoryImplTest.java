package group3b.repository.impl;

import org.junit.Test;

import static org.junit.Assert.*;
import group3b.domain.Vehicle;
import group3b.factory.VehicleFactory;
import group3b.repository.VehicleRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.DEFAULT)

public class VehicleRepositoryImplTest {

    private VehicleRepository repository;
    private Vehicle vehicle;

    private Vehicle getSavedVehicle(){
        Set<Vehicle> savedVehicles = this.repository.getAll();
        return savedVehicles.iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.repository = VehicleRepositoryImpl.getRepository();
        this.vehicle = VehicleFactory.getVehicle("Test Vehicle");
    }

    @Test
    public void create() {

        Vehicle testCreate = this.repository.create(this.vehicle);
        Assert.assertSame(testCreate, this.vehicle);

    }

    @Test
    public void delete() {

        int startingSize = this.repository.getAll().size();
        Vehicle savedVehicle = getSavedVehicle();
        this.repository.delete(savedVehicle.getVehicleId());

        Assert.assertEquals(startingSize-1,this.repository.getAll().size());

        //Create another vehicle after deleting so that Read() has something to read.
        this.repository.create(this.vehicle);

    }

    @Test
    public void read() {

        Vehicle savedVehicle = getSavedVehicle();
        String id = savedVehicle.getVehicleId();
        Vehicle readVehicle = this.repository.read(id);
        Assert.assertEquals(savedVehicle, readVehicle);
    }

    @Test
    public void update() {

        Vehicle saved = getSavedVehicle();
        String id = saved.getVehicleId();
        String newName = "Hello";
        saved.setName(newName);
        this.repository.update(saved);

        Assert.assertEquals(newName,this.repository.read(id).getName());

    }

    @Test
    public void getAll() {

        Set<Vehicle> all = this.repository.getAll();
        Assert.assertNotNull(all);

    }
}
