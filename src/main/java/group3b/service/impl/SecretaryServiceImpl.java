package group3b.service.impl;

import group3b.domain.Secretary;
import group3b.repository.SecretaryRepository;
import group3b.repository.impl.SecretaryRepositoryImpl;
import group3b.service.SecretaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SecretaryServiceImpl implements SecretaryService {

    @Autowired
    @Qualifier("SecretaryRepo")
    private static SecretaryServiceImpl service = null;
    private SecretaryRepository repository;

    private SecretaryServiceImpl(){
        this.repository = SecretaryRepositoryImpl.getRepository();
    }

    public static SecretaryService getService(){
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

    @Override
    public Set<Secretary> getAll() {
        return repository.getAll();
    }

}