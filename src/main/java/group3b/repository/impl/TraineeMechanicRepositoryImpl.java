package group3b.repository.impl;

import group3b.domain.TraineeMechanic;
import group3b.repository.TraineeMechanicRepository;

import java.util.HashSet;
import java.util.Set;

public class TraineeMechanicRepositoryImpl implements TraineeMechanicRepository {

    private static TraineeMechanicRepositoryImpl repository = null;
    private Set<TraineeMechanic> traineeMechanics;

    private TraineeMechanicRepositoryImpl(){
        this.traineeMechanics = new HashSet<>();
    }

    public static TraineeMechanicRepositoryImpl getRepository(){
        if (repository == null) repository = new TraineeMechanicRepositoryImpl();
        return repository;
    }

    @Override
    public Set<TraineeMechanic> getAll() {
        return this.traineeMechanics;
    }

    @Override
    public TraineeMechanic create(TraineeMechanic traineeMechanic) {
        this.traineeMechanics.add(traineeMechanic);
        return traineeMechanic;
    }

    @Override
    public TraineeMechanic update(TraineeMechanic traineeMechanic) {

        TraineeMechanic[] cloneOfTraineeMechanics = traineeMechanics.toArray(new TraineeMechanic[traineeMechanics.size()]);
        for (int i = 0; i<cloneOfTraineeMechanics.length;i++) {
            if (cloneOfTraineeMechanics[i].equals(traineeMechanic)) {
                traineeMechanics.remove(cloneOfTraineeMechanics[i]);
            }
        }
        return create(traineeMechanic);
    }

    @Override
    public void delete(String traineeMechanicId) {
        TraineeMechanic[] cloneOfTraineeMechanics = traineeMechanics.toArray(new TraineeMechanic[traineeMechanics.size()]);
        for (int i = 0; i<cloneOfTraineeMechanics.length;i++) {
            if (cloneOfTraineeMechanics[i].getTraineeMechanicId() == traineeMechanicId) {
                if (traineeMechanics.contains(cloneOfTraineeMechanics[i])){
                    traineeMechanics.remove(cloneOfTraineeMechanics[i]);
                }
            }
        }
    }

    @Override
    public TraineeMechanic read(String traineeMechanicId) {

        TraineeMechanic traineeMechanicToReturn = null;

        TraineeMechanic[] cloneOfTraineeMechanics = traineeMechanics.toArray(new TraineeMechanic[traineeMechanics.size()]);

        for (int i = 0; i<cloneOfTraineeMechanics.length;i++) {
            if (cloneOfTraineeMechanics[i].getTraineeMechanicId() == traineeMechanicId) {
                traineeMechanicToReturn = cloneOfTraineeMechanics[i];
            }
        }

        return traineeMechanicToReturn;
    }
}