package group3b.service.impl;

import group3b.domain.Engine;
import group3b.repository.EngineRepository;
import group3b.repository.impl.EngineRepositoryImpl;
import group3b.service.EngineService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class EngineServiceImpl implements EngineService {

    @Qualifier("InMemory")
    private static EngineServiceImpl service = null;
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

    @Override
    public Set<Engine> getAll() {
        return repository.getAll();
    }

}