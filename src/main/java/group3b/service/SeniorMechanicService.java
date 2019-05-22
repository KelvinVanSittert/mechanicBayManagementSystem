package group3b.service;
import group3b.domain.SeniorMechanic;

import java.util.Set;

public interface SeniorMechanicService extends IService<SeniorMechanic, String>{
    Set<SeniorMechanic> getAll();
}
