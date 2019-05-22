package group3b.repository;

import group3b.domain.Bay;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface BayRepository extends IRepository<Bay, String>{

    Set<Bay> getAll();

}
