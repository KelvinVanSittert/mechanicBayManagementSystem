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

        Engine[] cloneOfEngines = engines.toArray(new Engine[engines.size()]);
        for (int i = 0; i<cloneOfEngines.length;i++) {
            if (cloneOfEngines[i].equals(engine)) {
                engines.remove(cloneOfEngines[i]);
            }
        }
        return create(engine);
    }

    @Override
    public void delete(String engineId) {
        Engine[] cloneOfEngines = engines.toArray(new Engine[engines.size()]);
        for (int i = 0; i<cloneOfEngines.length;i++) {
            if (cloneOfEngines[i].getEngineId() == engineId) {
                if (engines.contains(cloneOfEngines[i])){
                    engines.remove(cloneOfEngines[i]);
                }
            }
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
