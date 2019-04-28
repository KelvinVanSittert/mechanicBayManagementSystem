package group3b.repository;

import group3b.domain.Engine;

import java.util.Set;


public interface EngineRepository extends IRepository<Engine, String>{

    Set<Engine> getAll();

}