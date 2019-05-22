package group3b.service;
import group3b.domain.Tool;

import java.util.Set;

public interface ToolService extends IService<Tool, String>{
    Set<Tool> getAll();
}
