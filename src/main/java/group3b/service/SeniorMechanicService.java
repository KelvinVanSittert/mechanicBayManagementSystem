package group3b.service;
import group3b.domain.SeniorMechanic;

public interface SeniorMechanicService extends IService<SeniorMechanic, String>{
    SeniorMechanic create(SeniorMechanic seniorMechanic);
}
