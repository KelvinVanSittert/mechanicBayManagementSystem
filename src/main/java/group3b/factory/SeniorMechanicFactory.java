package group3b.factory;

import group3b.domain.SeniorMechanic;
import group3b.util.Misc;

public class SeniorMechanicFactory {
    public static SeniorMechanic getSeniorMechanic(String Name) {
        return new SeniorMechanic.Builder().seniorMechanicId(Misc.generateId())
                .name(Name)
                .build();
    }

}
