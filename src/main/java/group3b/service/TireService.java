package group3b.service;
import group3b.domain.Tire;

public interface TireService extends IService<Tire, String>{
    Tire create(Tire tire);
}
