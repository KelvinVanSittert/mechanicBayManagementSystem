package group3b.repository.impl;

import group3b.domain.Manager;
import group3b.repository.ManagerRepository;

import java.util.HashSet;
import java.util.Set;

public class ManagerRepositoryImpl implements ManagerRepository {

    private static ManagerRepositoryImpl repository = null;
    private Set<Manager> managers;

    private ManagerRepositoryImpl(){
        this.managers = new HashSet<>();
    }

    public static ManagerRepositoryImpl getRepository(){
        if (repository == null) repository = new ManagerRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Manager> getAll() {
        return this.managers;
    }

    @Override
    public Manager create(Manager manager) {
        this.managers.add(manager);
        return manager;
    }

    @Override
    public Manager update(Manager manager) {

        return manager;
    }

    @Override
    public void delete(String managerId) {
        Manager[] cloneOfManagers = managers.toArray(new Manager[managers.size()]);
        for (int i = 0; i<cloneOfManagers.length;i++) {
            if (cloneOfManagers[i].getManagerId() == managerId) {
                cloneOfManagers[i] = null;
            }
        }
        managers.clear();

        for (int j = 0; j<cloneOfManagers.length;j++){
            managers.add(cloneOfManagers[j]);
        }

    }

    @Override
    public Manager read(String managerId) {

        Manager managerToReturn = null;

        Manager[] cloneOfManagers = managers.toArray(new Manager[managers.size()]);

        for (int i = 0; i<cloneOfManagers.length;i++) {
            if (cloneOfManagers[i].getManagerId() == managerId) {
                managerToReturn = cloneOfManagers[i];
            }
        }

        return managerToReturn;
    }
}