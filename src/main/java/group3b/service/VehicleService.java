package group3b.service;
import group3b.domain.Vehicle;

public interface VehicleService extends IService<Vehicle, String>{
    Vehicle create(Vehicle vehicle);
}
