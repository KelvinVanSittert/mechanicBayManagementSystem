package group3b.repository;

import group3b.domain.Tool;

import java.util.Set;


public interface ToolRepository extends IRepository<Tool, String>{

    Set<Tool> getAll();

}