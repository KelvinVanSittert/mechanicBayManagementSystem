package group3b.repository;

        import group3b.domain.Vehicle;

        import java.util.Set;


public interface VehicleRepository extends IRepository<Vehicle, String>{

    Set<Vehicle> getAll();

}
