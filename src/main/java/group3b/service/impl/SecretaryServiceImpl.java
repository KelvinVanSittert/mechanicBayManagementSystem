package group3b.service.impl;

import group3b.domain.Secretary;
import group3b.repository.SecretaryRepository;
import group3b.repository.impl.SecretaryRepositoryImpl;
import group3b.service.SecretaryService;

import java.util.Set;

public class SecretaryServiceImpl implements SecretaryService {

    private SecretaryServiceImpl service = null;
    private SecretaryRepository repository;

    private SecretaryServiceImpl(){
        this.repository = SecretaryRepositoryImpl.getRepository();
    }

    public SecretaryService getService(){
        if (service == null) service = new SecretaryServiceImpl();
        return service;
    }

    @Override
    public Secretary create(Secretary secretary) {
        return this.repository.create(secretary);
    }

    @Override
    public Secretary update(Secretary secretary) {
        return this.repository.update(secretary);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Secretary read(String s) {
        return this.repository.read(s);
    }

}