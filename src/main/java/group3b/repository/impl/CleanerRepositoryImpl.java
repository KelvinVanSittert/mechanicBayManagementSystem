package group3b.repository.impl;

import group3b.domain.Cleaner;
import group3b.repository.CleanerRepository;

import java.util.HashSet;
import java.util.Set;

public class CleanerRepositoryImpl implements CleanerRepository {

    private static CleanerRepositoryImpl repository = null;
    private Set<Cleaner> cleaners;

    private CleanerRepositoryImpl(){
        this.cleaners = new HashSet<>();
    }

    public static CleanerRepositoryImpl getRepository(){
        if (repository == null) repository = new CleanerRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Cleaner> getAll() {
        return this.cleaners;
    }

    @Override
    public Cleaner create(Cleaner cleaner) {
        this.cleaners.add(cleaner);
        return cleaner;
    }

    @Override
    public Cleaner update(Cleaner cleaner) {

        return cleaner;
    }

    @Override
    public void delete(String cleanerId) {
        Cleaner[] cloneOfCleaners = cleaners.toArray(new Cleaner[cleaners.size()]);
        for (int i = 0; i<cloneOfCleaners.length;i++) {
            if (cloneOfCleaners[i].getCleanerId() == cleanerId) {
                cloneOfCleaners[i] = null;
            }
        }
        cleaners.clear();

        for (int j = 0; j<cloneOfCleaners.length;j++){
            cleaners.add(cloneOfCleaners[j]);
        }

    }

    @Override
    public Cleaner read(String cleanerId) {

        Cleaner cleanerToReturn = null;

        Cleaner[] cloneOfCleaners = cleaners.toArray(new Cleaner[cleaners.size()]);

        for (int i = 0; i<cloneOfCleaners.length;i++) {
            if (cloneOfCleaners[i].getCleanerId() == cleanerId) {
                cleanerToReturn = cloneOfCleaners[i];
            }
        }

        return cleanerToReturn;
    }
}