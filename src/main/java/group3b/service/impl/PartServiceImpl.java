package group3b.service.impl;

import group3b.domain.Part;
import group3b.repository.PartRepository;
import group3b.repository.impl.PartRepositoryImpl;
import group3b.service.PartService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PartServiceImpl implements PartService {

    @Qualifier("InMemory")
    private static PartServiceImpl service = null;
    private PartRepository repository;

    private PartServiceImpl(){
        this.repository = PartRepositoryImpl.getRepository();
    }

    public PartService getService(){
        if (service == null) service = new PartServiceImpl();
        return service;
    }

    @Override
    public Part create(Part part) {
        return this.repository.create(part);
    }

    @Override
    public Part update(Part part) {
        return this.repository.update(part);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Part read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Part> getAll() {
        return repository.getAll();
    }

}