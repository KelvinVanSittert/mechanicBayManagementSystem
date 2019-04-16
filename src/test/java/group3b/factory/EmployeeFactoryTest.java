package group3b.factory;

import org.junit.Assert;
import org.junit.Test;
import group3b.domain.Employee;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    @Test
    public void getEmployee() {

        String name = "ADP 3";
        Employee employee = EmployeeFactory.getEmployee(name);
        System.out.println(employee);
        Assert.assertNotNull(employee.getEmployeeId());

    }
}