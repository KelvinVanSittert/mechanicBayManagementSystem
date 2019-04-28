package group3b.repository;

import group3b.domain.MechanicBay;

import java.util.Set;


public interface MechanicBayRepository extends IRepository<MechanicBay, String>{

    Set<MechanicBay> getAll();

}