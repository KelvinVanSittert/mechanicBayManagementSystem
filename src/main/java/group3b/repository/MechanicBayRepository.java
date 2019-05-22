package group3b.repository;

import group3b.domain.MechanicBay;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface MechanicBayRepository extends IRepository<MechanicBay, String>{

    Set<MechanicBay> getAll();

}