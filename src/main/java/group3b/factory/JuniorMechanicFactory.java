package group3b.factory;

import group3b.domain.JuniorMechanic;
import group3b.util.Misc;

public class JuniorMechanicFactory {
    public static JuniorMechanic getJuniorMechanic(String Name) {
        return new JuniorMechanic.Builder().juniorMechanicId(Misc.generateId())
                .name(Name)
                .build();
    }

}
