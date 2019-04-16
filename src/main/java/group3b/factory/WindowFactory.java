package group3b.factory;

import group3b.domain.Window;
import group3b.util.Misc;

public class WindowFactory {
    public static Window getWindow(String Name) {
        return new Window.Builder().windowId(Misc.generateId())
                .name(Name)
                .build();
    }

}
