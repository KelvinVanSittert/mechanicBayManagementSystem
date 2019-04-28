package group3b.service.impl;

import group3b.domain.SeniorMechanic;
import group3b.repository.SeniorMechanicRepository;
import group3b.repository.impl.SeniorMechanicRepositoryImpl;
import group3b.service.SeniorMechanicService;

import java.util.Set;

public class SeniorMechanicServiceImpl implements SeniorMechanicService {

    private SeniorMechanicServiceImpl service = null;
    private SeniorMechanicRepository repository;

    private SeniorMechanicServiceImpl(){
        this.repository = SeniorMechanicRepositoryImpl.getRepository();
    }

    public SeniorMechanicService getService(){
        if (service == null) service = new SeniorMechanicServiceImpl();
        return service;
    }

    @Override
    public SeniorMechanic create(SeniorMechanic seniorMechanic) {
        return this.repository.create(seniorMechanic);
    }

    @Override
    public SeniorMechanic update(SeniorMechanic seniorMechanic) {
        return this.repository.update(seniorMechanic);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public SeniorMechanic read(String s) {
        return this.repository.read(s);
    }

}