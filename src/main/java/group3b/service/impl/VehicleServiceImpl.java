package group3b.service.impl;

import group3b.domain.Vehicle;
import group3b.repository.VehicleRepository;
import group3b.repository.impl.VehicleRepositoryImpl;
import group3b.service.VehicleService;

import java.util.Set;

public class VehicleServiceImpl implements VehicleService {

    private VehicleServiceImpl service = null;
    private VehicleRepository repository;

    private VehicleServiceImpl(){
        this.repository = VehicleRepositoryImpl.getRepository();
    }

    public VehicleService getService(){
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

}