package group3b.repository;

import group3b.domain.Mechanic;

import java.util.Set;


public interface MechanicRepository extends IRepository<Mechanic, String>{

    Set<Mechanic> getAll();

}
