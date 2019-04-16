package group3b.factory;

import group3b.domain.Cleaner;
import group3b.util.Misc;

public class CleanerFactory {
    public static Cleaner getCleaner(String Name) {
        return new Cleaner.Builder().cleanerId(Misc.generateId())
                .name(Name)
                .build();
    }

}