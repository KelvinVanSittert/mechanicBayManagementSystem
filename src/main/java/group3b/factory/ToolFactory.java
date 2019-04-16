package group3b.factory;

import group3b.domain.Tool;
import group3b.util.Misc;

public class ToolFactory {
    public static Tool getTool(String Name) {
        return new Tool.Builder().toolId(Misc.generateId())
                .name(Name)
                .build();
    }

}
