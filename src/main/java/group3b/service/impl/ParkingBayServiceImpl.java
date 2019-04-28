package group3b.service.impl;

import group3b.domain.ParkingBay;
import group3b.repository.ParkingBayRepository;
import group3b.repository.impl.ParkingBayRepositoryImpl;
import group3b.service.ParkingBayService;

import java.util.Set;

public class ParkingBayServiceImpl implements ParkingBayService {

    private ParkingBayServiceImpl service = null;
    private ParkingBayRepository repository;

    private ParkingBayServiceImpl(){
        this.repository = ParkingBayRepositoryImpl.getRepository();
    }

    public ParkingBayService getService(){
        if (service == null) service = new ParkingBayServiceImpl();
        return service;
    }

    @Override
    public ParkingBay create(ParkingBay parkingBay) {
        return this.repository.create(parkingBay);
    }

    @Override
    public ParkingBay update(ParkingBay parkingBay) {
        return this.repository.update(parkingBay);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public ParkingBay read(String s) {
        return this.repository.read(s);
    }

}