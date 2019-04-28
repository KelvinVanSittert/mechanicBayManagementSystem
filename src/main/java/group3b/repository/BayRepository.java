package group3b.repository;

import group3b.domain.Bay;

import java.util.Set;


public interface BayRepository extends IRepository<Bay, String>{

    Set<Bay> getAll();


}
