package group3b.repository;

import group3b.domain.ParkingBay;

import java.util.Set;


public interface ParkingBayRepository extends IRepository<ParkingBay, String>{

    Set<ParkingBay> getAll();

}