package group3b.repository.impl;

import group3b.domain.Door;
import group3b.repository.DoorRepository;

import java.util.HashSet;
import java.util.Set;

public class DoorRepositoryImpl implements DoorRepository {

    private static DoorRepositoryImpl repository = null;
    private Set<Door> doors;

    private DoorRepositoryImpl(){
        this.doors = new HashSet<>();
    }

    public static DoorRepositoryImpl getRepository(){
        if (repository == null) repository = new DoorRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Door> getAll() {
        return this.doors;
    }

    @Override
    public Door create(Door door) {
        this.doors.add(door);
        return door;
    }

    @Override
    public Door update(Door door) {

        return door;
    }

    @Override
    public void delete(String doorId) {
        Door[] cloneOfDoors = doors.toArray(new Door[doors.size()]);
        for (int i = 0; i<cloneOfDoors.length;i++) {
            if (cloneOfDoors[i].getDoorId() == doorId) {
                cloneOfDoors[i] = null;
            }
        }
        doors.clear();

        for (int j = 0; j<cloneOfDoors.length;j++){
            doors.add(cloneOfDoors[j]);
        }

    }

    @Override
    public Door read(String doorId) {

        Door doorToReturn = null;

        Door[] cloneOfDoors = doors.toArray(new Door[doors.size()]);

        for (int i = 0; i<cloneOfDoors.length;i++) {
            if (cloneOfDoors[i].getDoorId() == doorId) {
                doorToReturn = cloneOfDoors[i];
            }
        }

        return doorToReturn;
    }
}