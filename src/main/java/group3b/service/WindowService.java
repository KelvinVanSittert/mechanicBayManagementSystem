package group3b.service;
import group3b.domain.Window;

import java.util.Set;

public interface WindowService extends IService<Window, String>{
    Set<Window> getAll();
}
