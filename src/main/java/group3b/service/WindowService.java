package group3b.service;
import group3b.domain.Window;

public interface WindowService extends IService<Window, String>{
    Window create(Window window);
}
