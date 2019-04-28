package group3b.service;
import group3b.domain.Door;

public interface DoorService extends IService<Door, String>{

    Door create(Door door);

}
