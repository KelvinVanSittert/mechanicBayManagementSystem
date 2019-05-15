package group3b.service.impl;

import group3b.domain.Engine;
import group3b.factory.EngineFactory;
import group3b.repository.EngineRepository;
import group3b.repository.impl.EngineRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EngineServiceImplTest {
    private EngineRepository repository;
    private Engine engine;

    private Engine getSavedEngine(){
        Set<Engine> savedEngines = this.repository.getAll();
        return savedEngines.iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.repository = EngineRepositoryImpl.getRepository();
        this.engine = EngineFactory.getEngine("Test Engine");
    }

    @Test
    public void create() {

        Engine testCreate = this.repository.create(this.engine);
        Assert.assertSame(testCreate, this.engine);

    }

    @Test
    public void delete() {

        int startingSize = this.repository.getAll().size();
        Engine savedEngine = getSavedEngine();
        this.repository.delete(savedEngine.getEngineId());

        Assert.assertEquals(startingSize-1,this.repository.getAll().size());

        //Create another engine after deleting so that Read() has something to read.
        this.repository.create(this.engine);

    }

    @Test
    public void read() {

        Engine savedEngine = getSavedEngine();
        String id = savedEngine.getEngineId();
        Engine readEngine = this.repository.read(id);
        Assert.assertEquals(savedEngine, readEngine);
    }

    @Test
    public void update() {

        Engine saved = getSavedEngine();
        String id = saved.getEngineId();
        String newName = "Hello";
        saved.setName(newName);
        this.repository.update(saved);

        Assert.assertEquals(newName,this.repository.read(id).getName());

    }

    @Test
    public void getAll() {

        Set<Engine> all = this.repository.getAll();
        Assert.assertNotNull(all);

    }
}
