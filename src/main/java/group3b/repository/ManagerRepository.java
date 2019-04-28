package group3b.repository;

import group3b.domain.Manager;

import java.util.Set;


public interface ManagerRepository extends IRepository<Manager, String>{

    Set<Manager> getAll();

}