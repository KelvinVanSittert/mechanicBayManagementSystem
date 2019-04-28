package group3b.repository;

import group3b.domain.Door;

import java.util.Set;


public interface DoorRepository extends IRepository<Door, String>{

    Set<Door> getAll();

}