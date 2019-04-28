package group3b.repository;

import group3b.domain.Employee;

import java.util.Set;


public interface EmployeeRepository extends IRepository<Employee, String>{

    Set<Employee> getAll();

}