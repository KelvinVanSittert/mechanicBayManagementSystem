package group3b.repository.impl;

import group3b.domain.Bike;
import group3b.repository.BikeRepository;

import java.util.HashSet;
import java.util.Set;

public class BikeRepositoryImpl implements BikeRepository {

    private static BikeRepositoryImpl repository = null;
    private Set<Bike> bikes;

    private BikeRepositoryImpl(){
        this.bikes = new HashSet<>();
    }

    public static BikeRepositoryImpl getRepository(){
        if (repository == null) repository = new BikeRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Bike> getAll() {
        return this.bikes;
    }

    @Override
    public Bike create(Bike bike) {
        this.bikes.add(bike);
        return bike;
    }

    @Override
    public Bike update(Bike bike) {

        return bike;
    }

    @Override
    public void delete(String bikeId) {
        Bike[] cloneOfBikes = bikes.toArray(new Bike[bikes.size()]);
        for (int i = 0; i<cloneOfBikes.length;i++) {
            if (cloneOfBikes[i].getBikeId() == bikeId) {
                cloneOfBikes[i] = null;
            }
        }
        bikes.clear();

        for (int j = 0; j<cloneOfBikes.length;j++){
            bikes.add(cloneOfBikes[j]);
        }

    }

    @Override
    public Bike read(String bikeId) {

        Bike bikeToReturn = null;

        Bike[] cloneOfBikes = bikes.toArray(new Bike[bikes.size()]);

        for (int i = 0; i<cloneOfBikes.length;i++) {
            if (cloneOfBikes[i].getBikeId() == bikeId) {
                bikeToReturn = cloneOfBikes[i];
            }
        }

        return bikeToReturn;
    }
}