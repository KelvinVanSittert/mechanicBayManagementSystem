package group3b.repository;

import group3b.domain.JuniorMechanic;

import java.util.Set;


public interface JuniorMechanicRepository extends IRepository<JuniorMechanic, String>{

    Set<JuniorMechanic> getAll();

}