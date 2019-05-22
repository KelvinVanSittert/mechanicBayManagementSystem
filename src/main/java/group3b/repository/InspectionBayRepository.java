package group3b.repository;

import group3b.domain.InspectionBay;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface InspectionBayRepository extends IRepository<InspectionBay, String>{

    Set<InspectionBay> getAll();

}