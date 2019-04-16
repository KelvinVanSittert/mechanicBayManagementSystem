package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.Cleaner;

import static org.junit.Assert.*;

public class CleanerFactoryTest {

    @Test
    public void getCleaner() {

        String name = "ADP 3";
        Cleaner cleaner = CleanerFactory.getCleaner(name);
        System.out.println(cleaner);
        Assert.assertNotNull(cleaner.getCleanerId());

    }
}