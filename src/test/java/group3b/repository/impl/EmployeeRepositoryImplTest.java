package group3b.repository.impl;

import org.junit.Test;

import static org.junit.Assert.*;
import group3b.domain.Employee;
import group3b.factory.EmployeeFactory;
import group3b.repository.EmployeeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.DEFAULT)

public class EmployeeRepositoryImplTest {

    private EmployeeRepository repository;
    private Employee employee;

    private Employee getSavedEmployee(){
        Set<Employee> savedEmployees = this.repository.getAll();
        return savedEmployees.iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.repository = EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.getEmployee("Test Employee");
    }

    @Test
    public void create() {

        Employee testCreate = this.repository.create(this.employee);
        Assert.assertSame(testCreate, this.employee);

    }

    @Test
    public void delete() {

        int startingSize = this.repository.getAll().size();
        Employee savedEmployee = getSavedEmployee();
        this.repository.delete(savedEmployee.getEmployeeId());

        Assert.assertEquals(startingSize-1,this.repository.getAll().size());

        //Create another employee after deleting so that Read() has something to read.
        this.repository.create(this.employee);

    }

    @Test
    public void read() {

        Employee savedEmployee = getSavedEmployee();
        String id = savedEmployee.getEmployeeId();
        Employee readEmployee = this.repository.read(id);
        Assert.assertEquals(savedEmployee, readEmployee);
    }

    @Test
    public void update() {

        Employee saved = getSavedEmployee();
        String id = saved.getEmployeeId();
        String newName = "Hello";
        saved.setName(newName);
        this.repository.update(saved);

        Assert.assertEquals(newName,this.repository.read(id).getName());

    }

    @Test
    public void getAll() {

        Set<Employee> all = this.repository.getAll();
        Assert.assertNotNull(all);

    }
}
