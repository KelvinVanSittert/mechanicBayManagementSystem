package group3b.service;
import group3b.domain.ParkingBay;

public interface ParkingBayService extends IService<ParkingBay, String>{
    ParkingBay create(ParkingBay parkingBay);

}
