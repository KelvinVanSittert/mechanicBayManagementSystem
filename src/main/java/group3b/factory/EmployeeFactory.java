package group3b.factory;

import group3b.domain.Employee;
import group3b.util.Misc;

public class EmployeeFactory {
    public static Employee getEmployee(String Name) {
        return new Employee.Builder().employeeId(Misc.generateId())
                .name(Name)
                .build();
    }

}

