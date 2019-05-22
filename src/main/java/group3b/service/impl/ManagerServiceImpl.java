package group3b.service.impl;

import group3b.domain.Manager;
import group3b.repository.ManagerRepository;
import group3b.repository.impl.ManagerRepositoryImpl;
import group3b.service.ManagerService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Qualifier("InMemory")
    private static ManagerServiceImpl service = null;
    private ManagerRepository repository;

    private ManagerServiceImpl(){
        this.repository = ManagerRepositoryImpl.getRepository();
    }

    public ManagerService getService(){
        if (service == null) service = new ManagerServiceImpl();
        return service;
    }

    @Override
    public Manager create(Manager manager) {
        return this.repository.create(manager);
    }

    @Override
    public Manager update(Manager manager) {
        return this.repository.update(manager);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Manager read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Manager> getAll() {
        return repository.getAll();
    }

}
