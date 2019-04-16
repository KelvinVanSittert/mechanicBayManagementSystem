package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.Engine;

import static org.junit.Assert.*;

public class EngineFactoryTest {

    @Test
    public void getEngine() {

        String name = "ADP 3";
        Engine engine = EngineFactory.getEngine(name);
        System.out.println(engine);
        Assert.assertNotNull(engine.getEngineId());

    }
}