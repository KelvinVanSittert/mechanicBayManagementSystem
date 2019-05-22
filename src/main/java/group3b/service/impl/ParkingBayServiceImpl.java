package group3b.service.impl;

import group3b.domain.ParkingBay;
import group3b.repository.ParkingBayRepository;
import group3b.repository.impl.ParkingBayRepositoryImpl;
import group3b.service.ParkingBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ParkingBayServiceImpl implements ParkingBayService {

    @Autowired
    @Qualifier("ParkingBayRepo")
    private static ParkingBayServiceImpl service = null;
    private ParkingBayRepository repository;

    private ParkingBayServiceImpl(){
        this.repository = ParkingBayRepositoryImpl.getRepository();
    }

    public static ParkingBayService getService(){
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

    @Override
    public Set<ParkingBay> getAll() {
        return repository.getAll();
    }

}