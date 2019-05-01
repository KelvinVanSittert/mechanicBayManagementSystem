package group3b.repository.impl;

import group3b.domain.Mechanic;
import group3b.repository.MechanicRepository;

import java.util.HashSet;
import java.util.Set;

public class MechanicRepositoryImpl implements MechanicRepository {

    private static MechanicRepositoryImpl repository = null;
    private Set<Mechanic> mechanics;

    private MechanicRepositoryImpl(){
        this.mechanics = new HashSet<>();
    }

    public static MechanicRepositoryImpl getRepository(){
        if (repository == null) repository = new MechanicRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Mechanic> getAll() {
        return this.mechanics;
    }

    @Override
    public Mechanic create(Mechanic mechanic) {
        this.mechanics.add(mechanic);
        return mechanic;
    }

    @Override
    public Mechanic update(Mechanic mechanic) {

        Mechanic[] cloneOfMechanics = mechanics.toArray(new Mechanic[mechanics.size()]);
        for (int i = 0; i<cloneOfMechanics.length;i++) {
            if (cloneOfMechanics[i].equals(mechanic)) {
                mechanics.remove(cloneOfMechanics[i]);
            }
        }
        return create(mechanic);
    }

    @Override
    public void delete(String mechanicId) {
        Mechanic[] cloneOfMechanics = mechanics.toArray(new Mechanic[mechanics.size()]);
        for (int i = 0; i<cloneOfMechanics.length;i++) {
            if (cloneOfMechanics[i].getMechanicId() == mechanicId) {
                if (mechanics.contains(cloneOfMechanics[i])){
                    mechanics.remove(cloneOfMechanics[i]);
                }
            }
        }
    }

    @Override
    public Mechanic read(String mechanicId) {

        Mechanic mechanicToReturn = null;

        Mechanic[] cloneOfMechanics = mechanics.toArray(new Mechanic[mechanics.size()]);

        for (int i = 0; i<cloneOfMechanics.length;i++) {
            if (cloneOfMechanics[i].getMechanicId() == mechanicId) {
                mechanicToReturn = cloneOfMechanics[i];
            }
        }

        return mechanicToReturn;
    }
}