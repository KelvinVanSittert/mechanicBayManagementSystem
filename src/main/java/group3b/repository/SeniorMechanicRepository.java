package group3b.repository;

import group3b.domain.SeniorMechanic;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface SeniorMechanicRepository extends IRepository<SeniorMechanic, String>{

    Set<SeniorMechanic> getAll();

}
