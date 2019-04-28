package group3b.service.impl;

import group3b.domain.Tire;
import group3b.repository.TireRepository;
import group3b.repository.impl.TireRepositoryImpl;
import group3b.service.TireService;

import java.util.Set;

public class TireServiceImpl implements TireService {

    private TireServiceImpl service = null;
    private TireRepository repository;

    private TireServiceImpl(){
        this.repository = TireRepositoryImpl.getRepository();
    }

    public TireService getService(){
        if (service == null) service = new TireServiceImpl();
        return service;
    }

    @Override
    public Tire create(Tire tire) {
        return this.repository.create(tire);
    }

    @Override
    public Tire update(Tire tire) {
        return this.repository.update(tire);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Tire read(String s) {
        return this.repository.read(s);
    }

}