package group3b.repository.impl;

import group3b.domain.Engine;
import group3b.repository.EngineRepository;

import java.util.HashSet;
import java.util.Set;

public class EngineRepositoryImpl implements EngineRepository {

    private static EngineRepositoryImpl repository = null;
    private Set<Engine> engines;

    private EngineRepositoryImpl(){
        this.engines = new HashSet<>();
    }

    public static EngineRepositoryImpl getRepository(){
        if (repository == null) repository = new EngineRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Engine> getAll() {
        return this.engines;
    }

    @Override
    public Engine create(Engine engine) {
        this.engines.add(engine);
        return engine;
    }

    @Override
    public Engine update(Engine engine) {

        return engine;
    }

    @Override
    public void delete(String engineId) {
        Engine[] cloneOfEngines = engines.toArray(new Engine[engines.size()]);
        for (int i = 0; i<cloneOfEngines.length;i++) {
            if (cloneOfEngines[i].getEngineId() == engineId) {
                cloneOfEngines[i] = null;
            }
        }
        engines.clear();

        for (int j = 0; j<cloneOfEngines.length;j++){
            engines.add(cloneOfEngines[j]);
        }

    }

    @Override
    public Engine read(String engineId) {

        Engine engineToReturn = null;

        Engine[] cloneOfEngines = engines.toArray(new Engine[engines.size()]);

        for (int i = 0; i<cloneOfEngines.length;i++) {
            if (cloneOfEngines[i].getEngineId() == engineId) {
                engineToReturn = cloneOfEngines[i];
            }
        }

        return engineToReturn;
    }
}