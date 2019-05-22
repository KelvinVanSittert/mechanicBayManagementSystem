package group3b.repository;

import group3b.domain.Door;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface DoorRepository extends IRepository<Door, String>{

    Set<Door> getAll();

}