package group3b.service.impl;

import group3b.domain.Cleaner;
import group3b.factory.CleanerFactory;
import group3b.repository.CleanerRepository;
import group3b.repository.impl.CleanerRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class CleanerServiceImplTest {
    private CleanerRepository repository;
    private Cleaner cleaner;

    private Cleaner getSavedCleaner(){
        Set<Cleaner> savedCleaners = this.repository.getAll();
        return savedCleaners.iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.repository = CleanerRepositoryImpl.getRepository();
        this.cleaner = CleanerFactory.getCleaner("Test Cleaner");
    }

    @Test
    public void create() {

        Cleaner testCreate = this.repository.create(this.cleaner);
        Assert.assertSame(testCreate, this.cleaner);

    }

    @Test
    public void delete() {

        int startingSize = this.repository.getAll().size();
        Cleaner savedCleaner = getSavedCleaner();
        this.repository.delete(savedCleaner.getCleanerId());

        Assert.assertEquals(startingSize-1,this.repository.getAll().size());

        //Create another cleaner after deleting so that Read() has something to read.
        this.repository.create(this.cleaner);

    }

    @Test
    public void read() {

        Cleaner savedCleaner = getSavedCleaner();
        String id = savedCleaner.getCleanerId();
        Cleaner readCleaner = this.repository.read(id);
        Assert.assertEquals(savedCleaner, readCleaner);
    }

    @Test
    public void update() {

        Cleaner saved = getSavedCleaner();
        String id = saved.getCleanerId();
        String newName = "Hello";
        saved.setName(newName);
        this.repository.update(saved);

        Assert.assertEquals(newName,this.repository.read(id).getName());

    }

    @Test
    public void getAll() {

        Set<Cleaner> all = this.repository.getAll();
        Assert.assertNotNull(all);

    }
}