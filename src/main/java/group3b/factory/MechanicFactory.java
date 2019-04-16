package group3b.factory;

import group3b.domain.Mechanic;
import group3b.util.Misc;

public class MechanicFactory {
    public static Mechanic getMechanic(String Name) {
        return new Mechanic.Builder().mechanicId(Misc.generateId())
                .name(Name)
                .build();
    }

}