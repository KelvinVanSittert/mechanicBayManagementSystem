package group3b.service;
import group3b.domain.TraineeMechanic;

import java.util.Set;

public interface TraineeMechanicService extends IService<TraineeMechanic, String>{
    Set<TraineeMechanic> getAll();
}
