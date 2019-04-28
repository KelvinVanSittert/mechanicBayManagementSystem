package group3b.service;
import group3b.domain.Bike;

public interface BikeService extends IService<Bike, String>{

    Bike create(Bike bike);

}
