package group3b.service.impl;

import group3b.domain.Employee;
import group3b.repository.EmployeeRepository;
import group3b.repository.impl.EmployeeRepositoryImpl;
import group3b.service.EmployeeService;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeServiceImpl service = null;
    private EmployeeRepository repository;

    private EmployeeServiceImpl(){
        this.repository = EmployeeRepositoryImpl.getRepository();
    }

    public EmployeeService getService(){
        if (service == null) service = new EmployeeServiceImpl();
        return service;
    }

    @Override
    public Employee create(Employee employee) {
        return this.repository.create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return this.repository.update(employee);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Employee read(String s) {
        return this.repository.read(s);
    }

}