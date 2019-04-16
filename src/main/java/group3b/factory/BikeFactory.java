package group3b.factory;

import group3b.domain.Bike;
import group3b.util.Misc;

public class BikeFactory {
    public static Bike getBike(String Name) {
        return new Bike.Builder().bikeId(Misc.generateId())
                .name(Name)
                .build();
    }

}

