package group3b.repository.impl;

import group3b.domain.Vehicle;
import group3b.repository.VehicleRepository;

import java.util.HashSet;
import java.util.Set;

public class VehicleRepositoryImpl implements VehicleRepository {

    private static VehicleRepositoryImpl repository = null;
    private Set<Vehicle> vehicles;

    private VehicleRepositoryImpl(){
        this.vehicles = new HashSet<>();
    }

    public static VehicleRepositoryImpl getRepository(){
        if (repository == null) repository = new VehicleRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Vehicle> getAll() {
        return this.vehicles;
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        this.vehicles.add(vehicle);
        return vehicle;
    }

    @Override
    public Vehicle update(Vehicle vehicle) {

        return vehicle;
    }

    @Override
    public void delete(String vehicleId) {
        Vehicle[] cloneOfVehicles = vehicles.toArray(new Vehicle[vehicles.size()]);
        for (int i = 0; i<cloneOfVehicles.length;i++) {
            if (cloneOfVehicles[i].getVehicleId() == vehicleId) {
                cloneOfVehicles[i] = null;
            }
        }
        vehicles.clear();

        for (int j = 0; j<cloneOfVehicles.length;j++){
            vehicles.add(cloneOfVehicles[j]);
        }

    }

    @Override
    public Vehicle read(String vehicleId) {

        Vehicle vehicleToReturn = null;

        Vehicle[] cloneOfVehicles = vehicles.toArray(new Vehicle[vehicles.size()]);

        for (int i = 0; i<cloneOfVehicles.length;i++) {
            if (cloneOfVehicles[i].getVehicleId() == vehicleId) {
                vehicleToReturn = cloneOfVehicles[i];
            }
        }

        return vehicleToReturn;
    }
}