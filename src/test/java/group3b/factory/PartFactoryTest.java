package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.Part;

import static org.junit.Assert.*;

public class PartFactoryTest {

    //Create
    @Test
    public void getPart() {

        String name = "ADP 3";
        Part part = PartFactory.getPart(name);
        System.out.println(part);
        Assert.assertNotNull(part.getPartId());

    }

    //Read
    @Test
    public void getName() {

        String name = "ADP 3";
        Part part = PartFactory.getPart(name);
        System.out.println(part);
        Assert.assertEquals("ADP 3", part.getName());
    }

    //Update
    @Test
    public void updatePart() {

        String name ="ADP 3";
        Part part = PartFactory.getPart(name);
        part.setName("Fun");
        System.out.println(part);
        Assert.assertEquals("Fun", part.getName());
    }

    //Delete
    @Test
    public void deletePart() {

        String name = "ADP 3";
        Part part = PartFactory.getPart(name);
        part = null;
        System.out.println(part);
        Assert.assertNull(part);
    }
}
