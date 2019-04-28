package group3b.repository;

import group3b.domain.Window;

import java.util.Set;


public interface WindowRepository extends IRepository<Window, String>{

    Set<Window> getAll();

}