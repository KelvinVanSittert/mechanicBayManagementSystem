package group3b.service;
import group3b.domain.MechanicBay;

import java.util.Set;

public interface MechanicBayService extends IService<MechanicBay, String>{
    Set<MechanicBay> getAll();
}
