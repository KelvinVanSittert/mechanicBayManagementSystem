package group3b.factory;

import group3b.domain.Manager;
import group3b.util.Misc;

public class ManagerFactory {
    public static Manager getManager(String Name) {
        return new Manager.Builder().managerId(Misc.generateId())
                .name(Name)
                .build();
    }

}
