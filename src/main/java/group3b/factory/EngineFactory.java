package group3b.factory;


import group3b.domain.Engine;
import group3b.util.Misc;

public class EngineFactory {
    public static Engine getEngine(String Name) {
        return new Engine.Builder().engineId(Misc.generateId())
                .name(Name)
                .build();
    }

}