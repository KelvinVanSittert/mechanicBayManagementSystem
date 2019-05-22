package group3b.service;
import group3b.domain.Door;

import java.util.Set;

public interface DoorService extends IService<Door, String>{

    Set<Door> getAll();

}
