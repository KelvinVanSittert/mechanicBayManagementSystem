package group3b.service.impl;

import group3b.domain.Engine;
import group3b.repository.EngineRepository;
import group3b.repository.impl.EngineRepositoryImpl;
import group3b.service.EngineService;

import java.util.Set;

public class EngineServiceImpl implements EngineService {

    private EngineServiceImpl service = null;
    private EngineRepository repository;

    private EngineServiceImpl(){
        this.repository = EngineRepositoryImpl.getRepository();
    }

    public EngineService getService(){
        if (service == null) service = new EngineServiceImpl();
        return service;
    }

    @Override
    public Engine create(Engine engine) {
        return this.repository.create(engine);
    }

    @Override
    public Engine update(Engine engine) {
        return this.repository.update(engine);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Engine read(String s) {
        return this.repository.read(s);
    }

}