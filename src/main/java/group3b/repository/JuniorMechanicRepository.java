package group3b.repository;

import group3b.domain.JuniorMechanic;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface JuniorMechanicRepository extends IRepository<JuniorMechanic, String>{

    Set<JuniorMechanic> getAll();

}