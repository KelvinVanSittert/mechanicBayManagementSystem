package group3b.repository;

import group3b.domain.Secretary;

import java.util.Set;


public interface SecretaryRepository extends IRepository<Secretary, String>{

    Set<Secretary> getAll();

}