package group3b.service;
import group3b.domain.Bike;

import java.util.Set;

public interface BikeService extends IService<Bike, String>{

    Set<Bike> getAll();

}
