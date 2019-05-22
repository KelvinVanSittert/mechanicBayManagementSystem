package group3b.service;
import group3b.domain.Engine;

import java.util.Set;

public interface EngineService extends IService<Engine, String>{

    Set<Engine> getAll();
}
