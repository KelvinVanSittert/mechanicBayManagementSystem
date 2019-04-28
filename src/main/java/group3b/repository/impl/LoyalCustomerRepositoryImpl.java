package group3b.repository.impl;

import group3b.domain.LoyalCustomer;
import group3b.repository.LoyalCustomerRepository;

import java.util.HashSet;
import java.util.Set;

public class LoyalCustomerRepositoryImpl implements LoyalCustomerRepository {

    private static LoyalCustomerRepositoryImpl repository = null;
    private Set<LoyalCustomer> loyalCustomers;

    private LoyalCustomerRepositoryImpl(){
        this.loyalCustomers = new HashSet<>();
    }

    public static LoyalCustomerRepositoryImpl getRepository(){
        if (repository == null) repository = new LoyalCustomerRepositoryImpl();
        return repository;
    }

    @Override
    public Set<LoyalCustomer> getAll() {
        return this.loyalCustomers;
    }

    @Override
    public LoyalCustomer create(LoyalCustomer loyalCustomer) {
        this.loyalCustomers.add(loyalCustomer);
        return loyalCustomer;
    }

    @Override
    public LoyalCustomer update(LoyalCustomer loyalCustomer) {

        return loyalCustomer;
    }

    @Override
    public void delete(String loyalCustomerId) {
        LoyalCustomer[] cloneOfLoyalCustomers = loyalCustomers.toArray(new LoyalCustomer[loyalCustomers.size()]);
        for (int i = 0; i<cloneOfLoyalCustomers.length;i++) {
            if (cloneOfLoyalCustomers[i].getLoyalCustomerId() == loyalCustomerId) {
                cloneOfLoyalCustomers[i] = null;
            }
        }
        loyalCustomers.clear();

        for (int j = 0; j<cloneOfLoyalCustomers.length;j++){
            loyalCustomers.add(cloneOfLoyalCustomers[j]);
        }

    }

    @Override
    public LoyalCustomer read(String loyalCustomerId) {

        LoyalCustomer loyalCustomerToReturn = null;

        LoyalCustomer[] cloneOfLoyalCustomers = loyalCustomers.toArray(new LoyalCustomer[loyalCustomers.size()]);

        for (int i = 0; i<cloneOfLoyalCustomers.length;i++) {
            if (cloneOfLoyalCustomers[i].getLoyalCustomerId() == loyalCustomerId) {
                loyalCustomerToReturn = cloneOfLoyalCustomers[i];
            }
        }

        return loyalCustomerToReturn;
    }
}