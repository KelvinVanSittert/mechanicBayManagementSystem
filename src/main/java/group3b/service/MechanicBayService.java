package group3b.service;
import group3b.domain.MechanicBay;

public interface MechanicBayService extends IService<MechanicBay, String>{
    MechanicBay create(MechanicBay mechanic);
}
