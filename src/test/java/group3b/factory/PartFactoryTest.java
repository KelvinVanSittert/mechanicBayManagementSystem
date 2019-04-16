package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.Part;

import static org.junit.Assert.*;

public class PartFactoryTest {

    @Test
    public void getPart() {

        String name = "ADP 3";
        Part part = PartFactory.getPart(name);
        System.out.println(part);
        Assert.assertNotNull(part.getPartId());

    }
}
