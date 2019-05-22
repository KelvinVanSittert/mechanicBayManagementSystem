package group3b.repository;

import group3b.domain.Part;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PartRepository extends IRepository<Part, String>{

    Set<Part> getAll();

}