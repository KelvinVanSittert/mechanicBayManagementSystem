package group3b.factory;

import group3b.domain.ParkingBay;
import group3b.util.Misc;

public class ParkingBayFactory {
    public static ParkingBay getParkingBay(String Name) {
        return new ParkingBay.Builder().parkingId(Misc.generateId())
                .parkingName(Name)
                .build();
    }

}
