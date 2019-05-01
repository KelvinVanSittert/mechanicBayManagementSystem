package group3b.repository.impl;

import org.junit.Test;

import static org.junit.Assert.*;
import group3b.domain.Door;
import group3b.factory.DoorFactory;
import group3b.repository.DoorRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.DEFAULT)

public class DoorRepositoryImplTest {

    private DoorRepository repository;
    private Door door;

    private Door getSavedDoor(){
        Set<Door> savedDoors = this.repository.getAll();
        return savedDoors.iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.repository = DoorRepositoryImpl.getRepository();
        this.door = DoorFactory.getDoor("Test Door");
    }

    @Test
    public void create() {

        Door testCreate = this.repository.create(this.door);
        Assert.assertSame(testCreate, this.door);

    }

    @Test
    public void delete() {

        int startingSize = this.repository.getAll().size();
        Door savedDoor = getSavedDoor();
        this.repository.delete(savedDoor.getDoorId());

        Assert.assertEquals(startingSize-1,this.repository.getAll().size());

        //Create another door after deleting so that Read() has something to read.
        this.repository.create(this.door);

    }

    @Test
    public void read() {

        Door savedDoor = getSavedDoor();
        String id = savedDoor.getDoorId();
        Door readDoor = this.repository.read(id);
        Assert.assertEquals(savedDoor, readDoor);
    }

    @Test
    public void update() {

        Door saved = getSavedDoor();
        String id = saved.getDoorId();
        String newName = "Hello";
        saved.setName(newName);
        this.repository.update(saved);

        Assert.assertEquals(newName,this.repository.read(id).getName());

    }

    @Test
    public void getAll() {

        Set<Door> all = this.repository.getAll();
        Assert.assertNotNull(all);

    }
}