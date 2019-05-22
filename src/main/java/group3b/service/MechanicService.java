package group3b.service;
import group3b.domain.Mechanic;

import java.util.Set;

public interface MechanicService extends IService<Mechanic, String>{
    Set<Mechanic> getAll();
}
