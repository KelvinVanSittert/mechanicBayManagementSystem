package group3b.repository.impl;

import group3b.domain.MechanicBay;
import group3b.repository.MechanicBayRepository;

import java.util.HashSet;
import java.util.Set;

public class MechanicBayRepositoryImpl implements MechanicBayRepository {

    private static MechanicBayRepositoryImpl repository = null;
    private Set<MechanicBay> mechanicBays;

    private MechanicBayRepositoryImpl(){
        this.mechanicBays = new HashSet<>();
    }

    public static MechanicBayRepositoryImpl getRepository(){
        if (repository == null) repository = new MechanicBayRepositoryImpl();
        return repository;
    }

    @Override
    public Set<MechanicBay> getAll() {
        return this.mechanicBays;
    }

    @Override
    public MechanicBay create(MechanicBay mechanicBay) {
        this.mechanicBays.add(mechanicBay);
        return mechanicBay;
    }

    @Override
    public MechanicBay update(MechanicBay mechanicBay) {

        return mechanicBay;
    }

    @Override
    public void delete(String mechanicBayId) {
        MechanicBay[] cloneOfMechanicBays = mechanicBays.toArray(new MechanicBay[mechanicBays.size()]);
        for (int i = 0; i<cloneOfMechanicBays.length;i++) {
            if (cloneOfMechanicBays[i].getMechanicBayId() == mechanicBayId) {
                cloneOfMechanicBays[i] = null;
            }
        }
        mechanicBays.clear();

        for (int j = 0; j<cloneOfMechanicBays.length;j++){
            mechanicBays.add(cloneOfMechanicBays[j]);
        }

    }

    @Override
    public MechanicBay read(String mechanicBayId) {

        MechanicBay mechanicBayToReturn = null;

        MechanicBay[] cloneOfMechanicBays = mechanicBays.toArray(new MechanicBay[mechanicBays.size()]);

        for (int i = 0; i<cloneOfMechanicBays.length;i++) {
            if (cloneOfMechanicBays[i].getMechanicBayId() == mechanicBayId) {
                mechanicBayToReturn = cloneOfMechanicBays[i];
            }
        }

        return mechanicBayToReturn;
    }
}