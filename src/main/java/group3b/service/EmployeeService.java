package group3b.service;
import group3b.domain.Employee;

import java.util.Set;

public interface EmployeeService extends IService<Employee, String>{

    Set<Employee> getAll();
}
