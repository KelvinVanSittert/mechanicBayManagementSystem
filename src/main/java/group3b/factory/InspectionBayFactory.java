package group3b.factory;


import group3b.domain.InspectionBay;
import group3b.util.Misc;

public class InspectionBayFactory {
    public static InspectionBay getInspectionBay(String Name) {
        return new InspectionBay.Builder().inspectionBayId(Misc.generateId())
                .name(Name)
                .build();
    }

}
