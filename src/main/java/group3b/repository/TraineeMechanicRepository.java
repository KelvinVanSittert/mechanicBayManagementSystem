package group3b.repository;

import group3b.domain.TraineeMechanic;

import java.util.Set;


public interface TraineeMechanicRepository extends IRepository<TraineeMechanic, String>{

    Set<TraineeMechanic> getAll();

}