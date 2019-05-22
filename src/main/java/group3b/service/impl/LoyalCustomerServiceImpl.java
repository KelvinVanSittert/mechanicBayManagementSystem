package group3b.service.impl;

import group3b.domain.LoyalCustomer;
import group3b.repository.LoyalCustomerRepository;
import group3b.repository.impl.LoyalCustomerRepositoryImpl;
import group3b.service.LoyalCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class LoyalCustomerServiceImpl implements LoyalCustomerService {

    @Autowired
    @Qualifier("LoyalCustomerRepo")
    private static LoyalCustomerServiceImpl service = null;
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

    @Override
    public Set<LoyalCustomer> getAll() {
        return repository.getAll();
    }

}