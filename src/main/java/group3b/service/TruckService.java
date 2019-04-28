package group3b.service;
import group3b.domain.Truck;

public interface TruckService extends IService<Truck, String>{
    Truck create(Truck truck);
}
