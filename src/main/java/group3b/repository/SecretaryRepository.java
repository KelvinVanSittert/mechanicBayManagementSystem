package group3b.repository;

import group3b.domain.Secretary;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface SecretaryRepository extends IRepository<Secretary, String>{

    Set<Secretary> getAll();

}