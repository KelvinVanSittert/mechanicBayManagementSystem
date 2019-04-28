package group3b.repository;

import group3b.domain.Part;

import java.util.Set;


public interface PartRepository extends IRepository<Part, String>{

    Set<Part> getAll();

}