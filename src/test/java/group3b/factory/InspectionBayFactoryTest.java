package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.InspectionBay;

import static org.junit.Assert.*;

public class InspectionBayFactoryTest {

    @Test
    public void getInspectionBay() {

        String name = "ADP 3";
        InspectionBay inspectionBay = InspectionBayFactory.getInspectionBay(name);
        System.out.println(inspectionBay);
        Assert.assertNotNull(inspectionBay.getInspectionBayId());

    }
}