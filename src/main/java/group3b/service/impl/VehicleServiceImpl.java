package group3b.service.impl;

import group3b.domain.Vehicle;
import group3b.repository.VehicleRepository;
import group3b.repository.impl.VehicleRepositoryImpl;
import group3b.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    @Qualifier("VehicleRepo")
    private static VehicleServiceImpl service = null;
    private VehicleRepository repository;

    private VehicleServiceImpl(){
        this.repository = VehicleRepositoryImpl.getRepository();
    }

    public static VehicleService getService(){
        if (service == null) service = new VehicleServiceImpl();
        return service;
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        return this.repository.create(vehicle);
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        return this.repository.update(vehicle);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Vehicle read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Vehicle> getAll() {
        return repository.getAll();
    }

}