package group3b.repository.impl;

import group3b.domain.SeniorMechanic;
import group3b.repository.SeniorMechanicRepository;

import java.util.HashSet;
import java.util.Set;

public class SeniorMechanicRepositoryImpl implements SeniorMechanicRepository {

    private static SeniorMechanicRepositoryImpl repository = null;
    private Set<SeniorMechanic> seniorMechanics;

    private SeniorMechanicRepositoryImpl(){
        this.seniorMechanics = new HashSet<>();
    }

    public static SeniorMechanicRepositoryImpl getRepository(){
        if (repository == null) repository = new SeniorMechanicRepositoryImpl();
        return repository;
    }

    @Override
    public Set<SeniorMechanic> getAll() {
        return this.seniorMechanics;
    }

    @Override
    public SeniorMechanic create(SeniorMechanic seniorMechanic) {
        this.seniorMechanics.add(seniorMechanic);
        return seniorMechanic;
    }

    @Override
    public SeniorMechanic update(SeniorMechanic seniorMechanic) {

        return seniorMechanic;
    }

    @Override
    public void delete(String seniorMechanicId) {
        SeniorMechanic[] cloneOfSeniorMechanics = seniorMechanics.toArray(new SeniorMechanic[seniorMechanics.size()]);
        for (int i = 0; i<cloneOfSeniorMechanics.length;i++) {
            if (cloneOfSeniorMechanics[i].getSeniorMechanicId() == seniorMechanicId) {
                cloneOfSeniorMechanics[i] = null;
            }
        }
        seniorMechanics.clear();

        for (int j = 0; j<cloneOfSeniorMechanics.length;j++){
            seniorMechanics.add(cloneOfSeniorMechanics[j]);
        }

    }

    @Override
    public SeniorMechanic read(String seniorMechanicId) {

        SeniorMechanic seniorMechanicToReturn = null;

        SeniorMechanic[] cloneOfSeniorMechanics = seniorMechanics.toArray(new SeniorMechanic[seniorMechanics.size()]);

        for (int i = 0; i<cloneOfSeniorMechanics.length;i++) {
            if (cloneOfSeniorMechanics[i].getSeniorMechanicId() == seniorMechanicId) {
                seniorMechanicToReturn = cloneOfSeniorMechanics[i];
            }
        }

        return seniorMechanicToReturn;
    }
}