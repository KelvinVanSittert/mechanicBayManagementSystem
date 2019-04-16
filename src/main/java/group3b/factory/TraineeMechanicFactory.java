package group3b.factory;

import group3b.domain.TraineeMechanic;
import group3b.util.Misc;

public class TraineeMechanicFactory {
    public static TraineeMechanic getTraineeMechanic(String Name) {
        return new TraineeMechanic.Builder().traineeMechanicId(Misc.generateId())
                .name(Name)
                .build();
    }

}
