package group3b.repository.impl;

import group3b.domain.Employee;
import group3b.repository.EmployeeRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl repository = null;
    private Set<Employee> employees;

    private EmployeeRepositoryImpl(){
        this.employees = new HashSet<>();
    }

    public static EmployeeRepositoryImpl getRepository(){
        if (repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Employee> getAll() {
        return this.employees;
    }

    @Override
    public Employee create(Employee employee) {
        this.employees.add(employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee) {

        return employee;
    }

    @Override
    public void delete(String employeeId) {
        Employee[] cloneOfEmployees = employees.toArray(new Employee[employees.size()]);
        for (int i = 0; i<cloneOfEmployees.length;i++) {
            if (cloneOfEmployees[i].getEmployeeId() == employeeId) {
                cloneOfEmployees[i] = null;
            }
        }
        employees.clear();

        for (int j = 0; j<cloneOfEmployees.length;j++){
            employees.add(cloneOfEmployees[j]);
        }

    }

    @Override
    public Employee read(String employeeId) {

        Employee employeeToReturn = null;

        Employee[] cloneOfEmployees = employees.toArray(new Employee[employees.size()]);

        for (int i = 0; i<cloneOfEmployees.length;i++) {
            if (cloneOfEmployees[i].getEmployeeId() == employeeId) {
                employeeToReturn = cloneOfEmployees[i];
            }
        }

        return employeeToReturn;
    }
}