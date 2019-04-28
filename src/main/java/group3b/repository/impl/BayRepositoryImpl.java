package group3b.repository.impl;

import group3b.domain.Bay;
import group3b.repository.BayRepository;

import java.util.HashSet;
import java.util.Set;

public class BayRepositoryImpl implements BayRepository {

    private static BayRepositoryImpl repository = null;
    private Set<Bay> bays;

    private BayRepositoryImpl(){
        this.bays = new HashSet<>();
    }

    public static BayRepositoryImpl getRepository(){
        if (repository == null) repository = new BayRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Bay> getAll() {
        return this.bays;
    }

    @Override
    public Bay create(Bay bay) {
        this.bays.add(bay);
        return bay;
    }

    @Override
    public Bay update(Bay bay) {

        if (bays.contains((bay))){
            Bay[] cloneOfBays = bays.toArray(new Bay[bays.size()]);
            //TODO
        }
        return bay;
    }

    @Override
    public void delete(String bayId) {
    Bay[] cloneOfBays = bays.toArray(new Bay[bays.size()]);
        for (int i = 0; i<cloneOfBays.length;i++) {
            if (cloneOfBays[i].getBayId() == bayId) {
                cloneOfBays[i] = null;
            }
        }
            bays.clear();

            for (int j = 0; j<cloneOfBays.length;j++){
                bays.add(cloneOfBays[j]);
            }

    }

    @Override
    public Bay read(String bayId) {

        Bay bayToReturn = null;

        Bay[] cloneOfBays = bays.toArray(new Bay[bays.size()]);

        for (int i = 0; i<cloneOfBays.length;i++) {
            if (cloneOfBays[i].getBayId() == bayId) {
                bayToReturn = cloneOfBays[i];
            }
        }

        return bayToReturn;
    }
}
