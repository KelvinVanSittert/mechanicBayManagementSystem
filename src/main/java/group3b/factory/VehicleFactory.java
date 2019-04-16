package group3b.factory;

import group3b.domain.Vehicle;
import group3b.util.Misc;

public class VehicleFactory {
    public static Vehicle getVehicle(String Name) {
        return new Vehicle.Builder().vehicleId(Misc.generateId())
                .name(Name)
                .build();
    }

}
