package group3b.service;
import group3b.domain.Manager;

import java.util.Set;

public interface ManagerService extends IService<Manager, String>{
    Set<Manager> getAll();
}
