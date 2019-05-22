package group3b.service;
import group3b.domain.Customer;

import java.util.Set;

public interface CustomerService extends IService<Customer, String>{

    Set<Customer> getAll();

}
