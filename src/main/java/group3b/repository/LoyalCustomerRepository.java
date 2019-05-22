package group3b.repository;

import group3b.domain.LoyalCustomer;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface LoyalCustomerRepository extends IRepository<LoyalCustomer, String>{

    Set<LoyalCustomer> getAll();

}