package group3b.service;
import group3b.domain.Truck;

import java.util.Set;

public interface TruckService extends IService<Truck, String>{
    Set<Truck> getAll();
}
