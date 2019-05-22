package group3b.repository;

import group3b.domain.Manager;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ManagerRepository extends IRepository<Manager, String>{

    Set<Manager> getAll();

}