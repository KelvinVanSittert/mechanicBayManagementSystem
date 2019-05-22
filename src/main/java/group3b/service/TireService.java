package group3b.service;
import group3b.domain.Tire;

import java.util.Set;

public interface TireService extends IService<Tire, String>{
    Set<Tire> getAll();
}
