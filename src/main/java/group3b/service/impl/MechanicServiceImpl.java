package group3b.service.impl;

import group3b.domain.Mechanic;
import group3b.repository.MechanicRepository;
import group3b.repository.impl.MechanicRepositoryImpl;
import group3b.service.MechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MechanicServiceImpl implements MechanicService {

    @Autowired
    @Qualifier("MechanicRepo")
    private static MechanicServiceImpl service = null;
    private MechanicRepository repository;

    private MechanicServiceImpl(){
        this.repository = MechanicRepositoryImpl.getRepository();
    }

    public MechanicService getService(){
        if (service == null) service = new MechanicServiceImpl();
        return service;
    }

    @Override
    public Mechanic create(Mechanic mechanic) {
        return this.repository.create(mechanic);
    }

    @Override
    public Mechanic update(Mechanic mechanic) {
        return this.repository.update(mechanic);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Mechanic read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Mechanic> getAll() {
        return repository.getAll();
    }

}