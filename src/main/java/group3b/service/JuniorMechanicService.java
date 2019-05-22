package group3b.service;
import group3b.domain.JuniorMechanic;

import java.util.Set;

public interface JuniorMechanicService extends IService<JuniorMechanic, String>{
    Set<JuniorMechanic> getAll();
}
