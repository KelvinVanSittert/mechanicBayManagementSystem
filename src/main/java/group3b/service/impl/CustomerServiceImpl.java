package group3b.service.impl;

import group3b.domain.Customer;
import group3b.repository.CustomerRepository;
import group3b.repository.impl.CustomerRepositoryImpl;
import group3b.service.CustomerService;

import java.util.Set;

public class CustomerServiceImpl implements CustomerService {

    private CustomerServiceImpl service = null;
    private CustomerRepository repository;


    private CustomerServiceImpl(){
        this.repository = CustomerRepositoryImpl.getRepository();
    }

    public CustomerService getService(){
        if (service == null) service = new CustomerServiceImpl();
        return service;
    }

    @Override
    public Customer create(Customer customer) {
        return this.repository.create(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return this.repository.update(customer);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Customer read(String s) {
        return this.repository.read(s);
    }

}