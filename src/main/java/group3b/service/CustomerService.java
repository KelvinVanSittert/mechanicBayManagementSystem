package group3b.service;
import group3b.domain.Customer;

public interface CustomerService extends IService<Customer, String>{

    Customer create(Customer customer);

}
