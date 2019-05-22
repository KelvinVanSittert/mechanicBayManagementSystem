package group3b.repository;

import group3b.domain.Bike;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface BikeRepository extends IRepository<Bike, String>{

    Set<Bike> getAll();

}