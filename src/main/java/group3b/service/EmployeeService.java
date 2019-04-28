package group3b.service;
import group3b.domain.Employee;

public interface EmployeeService extends IService<Employee, String>{

    Employee create(Employee employee);
}
