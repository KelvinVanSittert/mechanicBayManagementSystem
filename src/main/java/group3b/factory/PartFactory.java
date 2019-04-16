package group3b.factory;

import group3b.domain.Part;
import group3b.util.Misc;

public class PartFactory {
    public static Part getPart(String Name) {
        return new Part.Builder().partId(Misc.generateId())
                .name(Name)
                .build();
    }

}
