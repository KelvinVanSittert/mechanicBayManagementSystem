package group3b.repository.impl;

import org.junit.Test;

import static org.junit.Assert.*;
import group3b.domain.Tool;
import group3b.factory.ToolFactory;
import group3b.repository.ToolRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.DEFAULT)

public class ToolRepositoryImplTest {

    private ToolRepository repository;
    private Tool tool;

    private Tool getSavedTool(){
        Set<Tool> savedTools = this.repository.getAll();
        return savedTools.iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.repository = ToolRepositoryImpl.getRepository();
        this.tool = ToolFactory.getTool("Test Tool");
    }

    @Test
    public void create() {

        Tool testCreate = this.repository.create(this.tool);
        Assert.assertSame(testCreate, this.tool);

    }

    @Test
    public void delete() {

        int startingSize = this.repository.getAll().size();
        Tool savedTool = getSavedTool();
        this.repository.delete(savedTool.getToolId());

        Assert.assertEquals(startingSize-1,this.repository.getAll().size());

        //Create another tool after deleting so that Read() has something to read.
        this.repository.create(this.tool);

    }

    @Test
    public void read() {

        Tool savedTool = getSavedTool();
        String id = savedTool.getToolId();
        Tool readTool = this.repository.read(id);
        Assert.assertEquals(savedTool, readTool);
    }

    @Test
    public void update() {

        Tool saved = getSavedTool();
        String id = saved.getToolId();
        String newName = "Hello";
        saved.setName(newName);
        this.repository.update(saved);

        Assert.assertEquals(newName,this.repository.read(id).getName());

    }

    @Test
    public void getAll() {

        Set<Tool> all = this.repository.getAll();
        Assert.assertNotNull(all);

    }
}