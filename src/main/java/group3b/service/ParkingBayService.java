package group3b.service;
import group3b.domain.ParkingBay;

import java.util.Set;

public interface ParkingBayService extends IService<ParkingBay, String>{
    Set<ParkingBay> getAll();

}
