package group3b.service;
import group3b.domain.Vehicle;

import java.util.Set;

public interface VehicleService extends IService<Vehicle, String>{
    Set<Vehicle> getAll();
}
