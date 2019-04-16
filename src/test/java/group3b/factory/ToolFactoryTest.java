package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.Tool;

import static org.junit.Assert.*;

public class ToolFactoryTest {

    @Test
    public void getTool() {

        String name = "ADP 3";
        Tool tool = ToolFactory.getTool(name);
        System.out.println(tool);
        Assert.assertNotNull(tool.getToolId());

    }
}