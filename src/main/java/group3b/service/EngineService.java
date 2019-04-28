package group3b.service;
import group3b.domain.Engine;

public interface EngineService extends IService<Engine, String>{

    Engine create(Engine engine);
}
