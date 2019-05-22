package group3b.repository;

import group3b.domain.Engine;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface EngineRepository extends IRepository<Engine, String>{

    Set<Engine> getAll();

}