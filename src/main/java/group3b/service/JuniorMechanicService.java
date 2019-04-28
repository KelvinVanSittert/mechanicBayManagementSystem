package group3b.service;
import group3b.domain.JuniorMechanic;

public interface JuniorMechanicService extends IService<JuniorMechanic, String>{
    JuniorMechanic create(JuniorMechanic juniorMechanic);
}
