package group3b.service;
import group3b.domain.LoyalCustomer;

public interface LoyalCustomerService extends IService<LoyalCustomer, String>{
    LoyalCustomer create(LoyalCustomer loyalCustomer);
}
