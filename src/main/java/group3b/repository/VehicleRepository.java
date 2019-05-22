package group3b.repository;

        import group3b.domain.Vehicle;
        import org.springframework.stereotype.Repository;

        import java.util.Set;

@Repository
public interface VehicleRepository extends IRepository<Vehicle, String>{

    Set<Vehicle> getAll();

}
