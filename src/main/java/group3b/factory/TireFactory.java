package group3b.factory;

import group3b.domain.Tire;
import group3b.util.Misc;

public class TireFactory {
    public static Tire getTire(String Name) {
        return new Tire.Builder().tireId(Misc.generateId())
                .name(Name)
                .build();
    }

}
