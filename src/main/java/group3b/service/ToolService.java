package group3b.service;
import group3b.domain.Tool;

public interface ToolService extends IService<Tool, String>{
    Tool create(Tool tool);
}
