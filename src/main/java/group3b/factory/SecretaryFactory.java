package group3b.factory;

import group3b.domain.Secretary;
import group3b.util.Misc;

public class SecretaryFactory {
    public static Secretary getSecretary(String Name) {
        return new Secretary.Builder().secretaryId(Misc.generateId())
                .name(Name)
                .build();
    }

}
