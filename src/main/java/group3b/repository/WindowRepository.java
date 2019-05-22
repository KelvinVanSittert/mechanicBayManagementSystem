package group3b.repository;

import group3b.domain.Window;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface WindowRepository extends IRepository<Window, String>{

    Set<Window> getAll();

}