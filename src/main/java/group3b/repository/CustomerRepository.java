package group3b.repository;

import group3b.domain.Customer;

import java.util.Set;


public interface CustomerRepository extends IRepository<Customer, String>{

    Set<Customer> getAll();

}
