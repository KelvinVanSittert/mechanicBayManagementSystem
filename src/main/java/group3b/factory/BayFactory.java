package group3b.factory;

import group3b.domain.Bay;
import group3b.util.Misc;

public class BayFactory {
    public static Bay getBay(String Name) {
        return new Bay.Builder().bayId(Misc.generateId())
                .name(Name)
                .build();
    }

}

