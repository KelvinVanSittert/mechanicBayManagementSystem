package group3b.service.impl;

import group3b.domain.Bike;
import group3b.repository.BikeRepository;
import group3b.repository.impl.BikeRepositoryImpl;
import group3b.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BikeServiceImpl implements BikeService {

    @Autowired
    @Qualifier("BikeRepo")
    private static BikeServiceImpl service = null;
    private BikeRepository repository;

    private BikeServiceImpl(){
        this.repository = BikeRepositoryImpl.getRepository();
    }

    public static BikeService getService(){
        if (service == null) service = new BikeServiceImpl();
        return service;
    }

    @Override
    public Bike create(Bike bike) {
        return this.repository.create(bike);
    }

    @Override
    public Bike update(Bike bike) {
        return this.repository.update(bike);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Bike read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Bike> getAll() {
        return repository.getAll();
    }

}