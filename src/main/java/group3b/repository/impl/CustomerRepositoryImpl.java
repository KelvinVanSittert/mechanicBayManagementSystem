package group3b.repository.impl;

import group3b.domain.Customer;
import group3b.repository.CustomerRepository;

import java.util.HashSet;
import java.util.Set;

public class CustomerRepositoryImpl implements CustomerRepository {

    private static CustomerRepositoryImpl repository = null;
    private Set<Customer> customers;

    private CustomerRepositoryImpl(){
        this.customers = new HashSet<>();
    }

    public static CustomerRepositoryImpl getRepository(){
        if (repository == null) repository = new CustomerRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Customer> getAll() {
        return this.customers;
    }

    @Override
    public Customer create(Customer customer) {
        this.customers.add(customer);
        return customer;
    }

    @Override
    public Customer update(Customer customer) {

        return customer;
    }

    @Override
    public void delete(String customerId) {
        Customer[] cloneOfCustomers = customers.toArray(new Customer[customers.size()]);
        for (int i = 0; i<cloneOfCustomers.length;i++) {
            if (cloneOfCustomers[i].getCustomerId() == customerId) {
                cloneOfCustomers[i] = null;
            }
        }
        customers.clear();

        for (int j = 0; j<cloneOfCustomers.length;j++){
            customers.add(cloneOfCustomers[j]);
        }

    }

    @Override
    public Customer read(String customerId) {

        Customer customerToReturn = null;

        Customer[] cloneOfCustomers = customers.toArray(new Customer[customers.size()]);

        for (int i = 0; i<cloneOfCustomers.length;i++) {
            if (cloneOfCustomers[i].getCustomerId() == customerId) {
                customerToReturn = cloneOfCustomers[i];
            }
        }

        return customerToReturn;
    }
}