package group3b.service;
import group3b.domain.Manager;

public interface ManagerService extends IService<Manager, String>{
    Manager create(Manager manager);
}
