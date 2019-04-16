package group3b.factory;

import group3b.domain.MechanicBay;
import group3b.util.Misc;

public class MechanicBayFactory {
    public static MechanicBay getMechanicBay(String Name) {
        return new MechanicBay.Builder().mechanicBayId(Misc.generateId())
                .name(Name)
                .build();
    }

}
