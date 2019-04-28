package group3b.repository;

import group3b.domain.Tire;

import java.util.Set;


public interface TireRepository extends IRepository<Tire, String>{

    Set<Tire> getAll();

}