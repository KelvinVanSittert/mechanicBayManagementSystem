package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.Window;

import static org.junit.Assert.*;

public class WindowFactoryTest {

    @Test
    public void getWindow() {

        String name = "ADP 3";
        Window window = WindowFactory.getWindow(name);
        System.out.println(window);
        Assert.assertNotNull(window.getWindowId());

    }
}
