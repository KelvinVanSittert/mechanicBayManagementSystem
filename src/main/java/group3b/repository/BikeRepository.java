package group3b.repository;

import group3b.domain.Bike;

import java.util.Set;


public interface BikeRepository extends IRepository<Bike, String>{

    Set<Bike> getAll();

}