package group3b.repository;

import group3b.domain.InspectionBay;

import java.util.Set;


public interface InspectionBayRepository extends IRepository<InspectionBay, String>{

    Set<InspectionBay> getAll();

}