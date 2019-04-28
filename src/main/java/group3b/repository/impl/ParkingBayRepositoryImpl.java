package group3b.repository.impl;

import group3b.domain.ParkingBay;
import group3b.repository.ParkingBayRepository;

import java.util.HashSet;
import java.util.Set;

public class ParkingBayRepositoryImpl implements ParkingBayRepository {

    private static ParkingBayRepositoryImpl repository = null;
    private Set<ParkingBay> parkingBays;

    private ParkingBayRepositoryImpl(){
        this.parkingBays = new HashSet<>();
    }

    public static ParkingBayRepositoryImpl getRepository(){
        if (repository == null) repository = new ParkingBayRepositoryImpl();
        return repository;
    }

    @Override
    public Set<ParkingBay> getAll() {
        return this.parkingBays;
    }

    @Override
    public ParkingBay create(ParkingBay parkingBay) {
        this.parkingBays.add(parkingBay);
        return parkingBay;
    }

    @Override
    public ParkingBay update(ParkingBay parkingBay) {

        return parkingBay;
    }

    @Override
    public void delete(String parkingBayId) {
        ParkingBay[] cloneOfParkingBays = parkingBays.toArray(new ParkingBay[parkingBays.size()]);
        for (int i = 0; i<cloneOfParkingBays.length;i++) {
            if (cloneOfParkingBays[i].getParkingBayId() == parkingBayId) {
                cloneOfParkingBays[i] = null;
            }
        }
        parkingBays.clear();

        for (int j = 0; j<cloneOfParkingBays.length;j++){
            parkingBays.add(cloneOfParkingBays[j]);
        }

    }

    @Override
    public ParkingBay read(String parkingBayId) {

        ParkingBay parkingBayToReturn = null;

        ParkingBay[] cloneOfParkingBays = parkingBays.toArray(new ParkingBay[parkingBays.size()]);

        for (int i = 0; i<cloneOfParkingBays.length;i++) {
            if (cloneOfParkingBays[i].getParkingBayId() == parkingBayId) {
                parkingBayToReturn = cloneOfParkingBays[i];
            }
        }

        return parkingBayToReturn;
    }
}