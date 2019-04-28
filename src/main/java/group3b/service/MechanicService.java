package group3b.service;
import group3b.domain.Mechanic;

public interface MechanicService extends IService<Mechanic, String>{
    Mechanic create(Mechanic mechanic);
}
