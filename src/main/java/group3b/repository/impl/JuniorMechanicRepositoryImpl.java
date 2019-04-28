package group3b.repository.impl;

import group3b.domain.JuniorMechanic;
import group3b.repository.JuniorMechanicRepository;

import java.util.HashSet;
import java.util.Set;

public class JuniorMechanicRepositoryImpl implements JuniorMechanicRepository {

    private static JuniorMechanicRepositoryImpl repository = null;
    private Set<JuniorMechanic> juniorMechanics;

    private JuniorMechanicRepositoryImpl(){
        this.juniorMechanics = new HashSet<>();
    }

    public static JuniorMechanicRepositoryImpl getRepository(){
        if (repository == null) repository = new JuniorMechanicRepositoryImpl();
        return repository;
    }

    @Override
    public Set<JuniorMechanic> getAll() {
        return this.juniorMechanics;
    }

    @Override
    public JuniorMechanic create(JuniorMechanic juniorMechanic) {
        this.juniorMechanics.add(juniorMechanic);
        return juniorMechanic;
    }

    @Override
    public JuniorMechanic update(JuniorMechanic juniorMechanic) {

        return juniorMechanic;
    }

    @Override
    public void delete(String juniorMechanicId) {
        JuniorMechanic[] cloneOfJuniorMechanics = juniorMechanics.toArray(new JuniorMechanic[juniorMechanics.size()]);
        for (int i = 0; i<cloneOfJuniorMechanics.length;i++) {
            if (cloneOfJuniorMechanics[i].getJuniorMechanicId() == juniorMechanicId) {
                cloneOfJuniorMechanics[i] = null;
            }
        }
        juniorMechanics.clear();

        for (int j = 0; j<cloneOfJuniorMechanics.length;j++){
            juniorMechanics.add(cloneOfJuniorMechanics[j]);
        }

    }

    @Override
    public JuniorMechanic read(String juniorMechanicId) {

        JuniorMechanic juniorMechanicToReturn = null;

        JuniorMechanic[] cloneOfJuniorMechanics = juniorMechanics.toArray(new JuniorMechanic[juniorMechanics.size()]);

        for (int i = 0; i<cloneOfJuniorMechanics.length;i++) {
            if (cloneOfJuniorMechanics[i].getJuniorMechanicId() == juniorMechanicId) {
                juniorMechanicToReturn = cloneOfJuniorMechanics[i];
            }
        }

        return juniorMechanicToReturn;
    }
}