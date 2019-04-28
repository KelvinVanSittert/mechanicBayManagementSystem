package group3b.service.impl;

import group3b.domain.LoyalCustomer;
import group3b.repository.LoyalCustomerRepository;
import group3b.repository.impl.LoyalCustomerRepositoryImpl;
import group3b.service.LoyalCustomerService;

import java.util.Set;

public class LoyalCustomerServiceImpl implements LoyalCustomerService {

    private LoyalCustomerServiceImpl service = null;
    private LoyalCustomerRepository repository;

    private LoyalCustomerServiceImpl(){
        this.repository = LoyalCustomerRepositoryImpl.getRepository();
    }

    public LoyalCustomerService getService(){
        if (service == null) service = new LoyalCustomerServiceImpl();
        return service;
    }

    @Override
    public LoyalCustomer create(LoyalCustomer loyalCustomer) {
        return this.repository.create(loyalCustomer);
    }

    @Override
    public LoyalCustomer update(LoyalCustomer loyalCustomer) {
        return this.repository.update(loyalCustomer);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public LoyalCustomer read(String s) {
        return this.repository.read(s);
    }

}