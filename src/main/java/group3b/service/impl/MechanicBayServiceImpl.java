package group3b.service.impl;

import group3b.domain.MechanicBay;
import group3b.repository.MechanicBayRepository;
import group3b.repository.impl.MechanicBayRepositoryImpl;
import group3b.service.MechanicBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MechanicBayServiceImpl implements MechanicBayService {

    @Autowired
    @Qualifier("MechanicBayRepo")
    private static MechanicBayServiceImpl service = null;
    private MechanicBayRepository repository;

    private MechanicBayServiceImpl(){
        this.repository = MechanicBayRepositoryImpl.getRepository();
    }

    public MechanicBayService getService(){
        if (service == null) service = new MechanicBayServiceImpl();
        return service;
    }

    @Override
    public MechanicBay create(MechanicBay mechanicBay) {
        return this.repository.create(mechanicBay);
    }

    @Override
    public MechanicBay update(MechanicBay mechanicBay) {
        return this.repository.update(mechanicBay);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public MechanicBay read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<MechanicBay> getAll() {
        return repository.getAll();
    }

}