package group3b.service.impl;

import group3b.domain.Secretary;
import group3b.factory.SecretaryFactory;
import group3b.repository.SecretaryRepository;
import group3b.repository.impl.SecretaryRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class SecretaryServiceImplTest {

    private SecretaryRepository repository;
    private Secretary secretary;

    private Secretary getSavedSecretary(){
        Set<Secretary> savedSecretarys = this.repository.getAll();
        return savedSecretarys.iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.repository = SecretaryRepositoryImpl.getRepository();
        this.secretary = SecretaryFactory.getSecretary("Test Secretary");
    }

    @Test
    public void create() {

        Secretary testCreate = this.repository.create(this.secretary);
        Assert.assertSame(testCreate, this.secretary);

    }

    @Test
    public void delete() {

        int startingSize = this.repository.getAll().size();
        Secretary savedSecretary = getSavedSecretary();
        this.repository.delete(savedSecretary.getSecretaryId());

        Assert.assertEquals(startingSize-1,this.repository.getAll().size());

        //Create another secretary after deleting so that Read() has something to read.
        this.repository.create(this.secretary);

    }

    @Test
    public void read() {

        Secretary savedSecretary = getSavedSecretary();
        String id = savedSecretary.getSecretaryId();
        Secretary readSecretary = this.repository.read(id);
        Assert.assertEquals(savedSecretary, readSecretary);
    }

    @Test
    public void update() {

        Secretary saved = getSavedSecretary();
        String id = saved.getSecretaryId();
        String newName = "Hello";
        saved.setName(newName);
        this.repository.update(saved);

        Assert.assertEquals(newName,this.repository.read(id).getName());

    }

    @Test
    public void getAll() {

        Set<Secretary> all = this.repository.getAll();
        Assert.assertNotNull(all);

    }
}