package group3b.service;
import group3b.domain.TraineeMechanic;

public interface TraineeMechanicService extends IService<TraineeMechanic, String>{
    TraineeMechanic create(TraineeMechanic traineeMechanic);
}
