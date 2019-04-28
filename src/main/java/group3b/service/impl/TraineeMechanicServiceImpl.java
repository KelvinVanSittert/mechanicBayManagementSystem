package group3b.service.impl;

import group3b.domain.TraineeMechanic;
import group3b.repository.TraineeMechanicRepository;
import group3b.repository.impl.TraineeMechanicRepositoryImpl;
import group3b.service.TraineeMechanicService;

import java.util.Set;

public class TraineeMechanicServiceImpl implements TraineeMechanicService {

    private TraineeMechanicServiceImpl service = null;
    private TraineeMechanicRepository repository;

    private TraineeMechanicServiceImpl(){
        this.repository = TraineeMechanicRepositoryImpl.getRepository();
    }

    public TraineeMechanicService getService(){
        if (service == null) service = new TraineeMechanicServiceImpl();
        return service;
    }

    @Override
    public TraineeMechanic create(TraineeMechanic traineeMechanic) {
        return this.repository.create(traineeMechanic);
    }

    @Override
    public TraineeMechanic update(TraineeMechanic traineeMechanic) {
        return this.repository.update(traineeMechanic);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public TraineeMechanic read(String s) {
        return this.repository.read(s);
    }

}