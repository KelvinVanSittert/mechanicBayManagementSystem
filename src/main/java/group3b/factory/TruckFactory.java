package group3b.factory;

import group3b.domain.Truck;
import group3b.util.Misc;

public class TruckFactory {
    public static Truck getTruck(String Name) {
        return new Truck.Builder().truckId(Misc.generateId())
                .name(Name)
                .build();
    }

}
