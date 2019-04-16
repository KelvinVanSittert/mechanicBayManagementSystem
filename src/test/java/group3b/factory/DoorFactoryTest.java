package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.Door;

import static org.junit.Assert.*;

public class DoorFactoryTest {

    @Test
    public void getDoor() {

        String name = "ADP 3";
        Door door = DoorFactory.getDoor(name);
        System.out.println(door);
        Assert.assertNotNull(door.getDoorId());

    }
}