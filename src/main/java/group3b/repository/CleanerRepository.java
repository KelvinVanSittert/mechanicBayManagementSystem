package group3b.repository;

import group3b.domain.Cleaner;

import java.util.Set;


public interface CleanerRepository extends IRepository<Cleaner, String>{

    Set<Cleaner> getAll();

}