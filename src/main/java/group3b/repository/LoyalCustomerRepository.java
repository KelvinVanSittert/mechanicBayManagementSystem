package group3b.repository;

import group3b.domain.LoyalCustomer;

import java.util.Set;


public interface LoyalCustomerRepository extends IRepository<LoyalCustomer, String>{

    Set<LoyalCustomer> getAll();

}