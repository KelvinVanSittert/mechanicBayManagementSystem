package group3b.service;
import group3b.domain.LoyalCustomer;

import java.util.Set;

public interface LoyalCustomerService extends IService<LoyalCustomer, String>{
    Set<LoyalCustomer> getAll();
}
