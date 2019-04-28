package group3b.repository;

import group3b.domain.SeniorMechanic;

import java.util.Set;


public interface SeniorMechanicRepository extends IRepository<SeniorMechanic, String>{

    Set<SeniorMechanic> getAll();

}
