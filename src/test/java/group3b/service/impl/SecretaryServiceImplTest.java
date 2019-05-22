package group3b.service.impl;

import group3b.domain.Secretary;
import group3b.factory.SecretaryFactory;
import group3b.repository.SecretaryRepository;
import group3b.repository.impl.SecretaryRepositoryImpl;
import group3b.service.SecretaryService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)

public class SecretaryServiceImplTest {

    private SecretaryService service;
    private Secretary secretary;

    private Secretary getSavedSecretary(){
        Set<Secretary> savedSecretarys = this.service.getAll();
        return savedSecretarys.iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.service = SecretaryServiceImpl.getService();
        this.secretary = SecretaryFactory.getSecretary("Test Secretary");
    }

    @Test
    public void create() {

        Secretary testCreate = this.service.create(this.secretary);
        Assert.assertSame(testCreate, this.secretary);

    }

    @Test
    public void delete() {

        int startingSize = this.service.getAll().size();
        Secretary savedSecretary = getSavedSecretary();
        this.service.delete(savedSecretary.getSecretaryId());

        Assert.assertEquals(startingSize-1,this.service.getAll().size());

        //Create another secretary after deleting so that Read() has something to read.
        this.service.create(this.secretary);

    }

    @Test
    public void read() {

        Secretary savedSecretary = getSavedSecretary();
        String id = savedSecretary.getSecretaryId();
        Secretary readSecretary = this.service.read(id);
        Assert.assertEquals(savedSecretary, readSecretary);
    }

    @Test
    public void update() {

        Secretary saved = getSavedSecretary();
        String id = saved.getSecretaryId();
        String newName = "Hello";
        saved.setName(newName);
        this.service.update(saved);

        Assert.assertEquals(newName,this.service.read(id).getName());

    }

    @Test
    public void getAll() {

        Set<Secretary> all = this.service.getAll();
        Assert.assertNotNull(all);

    }
}