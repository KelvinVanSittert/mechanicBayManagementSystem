package group3b.repository.impl;

import group3b.domain.Tire;
import group3b.repository.TireRepository;

import java.util.HashSet;
import java.util.Set;

public class TireRepositoryImpl implements TireRepository {

    private static TireRepositoryImpl repository = null;
    private Set<Tire> tires;

    private TireRepositoryImpl(){
        this.tires = new HashSet<>();
    }

    public static TireRepositoryImpl getRepository(){
        if (repository == null) repository = new TireRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Tire> getAll() {
        return this.tires;
    }

    @Override
    public Tire create(Tire tire) {
        this.tires.add(tire);
        return tire;
    }

    @Override
    public Tire update(Tire tire) {

        return tire;
    }

    @Override
    public void delete(String tireId) {
        Tire[] cloneOfTires = tires.toArray(new Tire[tires.size()]);
        for (int i = 0; i<cloneOfTires.length;i++) {
            if (cloneOfTires[i].getTireId() == tireId) {
                cloneOfTires[i] = null;
            }
        }
        tires.clear();

        for (int j = 0; j<cloneOfTires.length;j++){
            tires.add(cloneOfTires[j]);
        }

    }

    @Override
    public Tire read(String tireId) {

        Tire tireToReturn = null;

        Tire[] cloneOfTires = tires.toArray(new Tire[tires.size()]);

        for (int i = 0; i<cloneOfTires.length;i++) {
            if (cloneOfTires[i].getTireId() == tireId) {
                tireToReturn = cloneOfTires[i];
            }
        }

        return tireToReturn;
    }
}