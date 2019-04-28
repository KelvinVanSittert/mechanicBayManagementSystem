package group3b.repository;

import group3b.domain.Truck;

import java.util.Set;


public interface TruckRepository extends IRepository<Truck, String>{

    Set<Truck> getAll();

}