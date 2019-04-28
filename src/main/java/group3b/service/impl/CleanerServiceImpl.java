package group3b.service.impl;

import group3b.domain.Cleaner;
import group3b.repository.CleanerRepository;
import group3b.repository.impl.CleanerRepositoryImpl;
import group3b.service.CleanerService;

import java.util.Set;

public class CleanerServiceImpl implements CleanerService {

    private CleanerServiceImpl service = null;
    private CleanerRepository repository;

    private CleanerServiceImpl(){
        this.repository = CleanerRepositoryImpl.getRepository();
    }

    public CleanerService getService(){
        if (service == null) service = new CleanerServiceImpl();
        return service;
    }

    @Override
    public Cleaner create(Cleaner cleaner) {
        return this.repository.create(cleaner);
    }

    @Override
    public Cleaner update(Cleaner cleaner) {
        return this.repository.update(cleaner);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Cleaner read(String s) {
        return this.repository.read(s);
    }

}