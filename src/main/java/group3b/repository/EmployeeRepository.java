package group3b.repository;

import group3b.domain.Employee;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface EmployeeRepository extends IRepository<Employee, String>{

    Set<Employee> getAll();

}