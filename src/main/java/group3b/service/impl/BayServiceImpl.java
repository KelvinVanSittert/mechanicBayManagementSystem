package group3b.service.impl;

import group3b.domain.Bay;
import group3b.repository.BayRepository;
import group3b.repository.impl.BayRepositoryImpl;
import group3b.service.BayService;

import java.util.Set;

public class BayServiceImpl implements BayService {

    private BayServiceImpl service = null;
    private BayRepository repository;

    private BayServiceImpl(){
        this.repository = BayRepositoryImpl.getRepository();
    }

    public BayService getService(){
        if (service == null) service = new BayServiceImpl();
        return service;
    }

    @Override
    public Bay create(Bay bay) {
        return this.repository.create(bay);
    }

    @Override
    public Bay update(Bay bay) {
        return this.repository.update(bay);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Bay read(String s) {
        return this.repository.read(s);
    }


}
