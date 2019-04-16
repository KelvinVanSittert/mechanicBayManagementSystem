package group3b.factory;

import group3b.domain.Door;
import group3b.util.Misc;

public class DoorFactory {
    public static Door getDoor(String Name) {
        return new Door.Builder().doorId(Misc.generateId())
                .name(Name)
                .build();
    }

}
