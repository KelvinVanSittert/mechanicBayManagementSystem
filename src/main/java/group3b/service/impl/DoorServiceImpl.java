package group3b.service.impl;

import group3b.domain.Door;
import group3b.repository.DoorRepository;
import group3b.repository.impl.DoorRepositoryImpl;
import group3b.service.DoorService;

import java.util.Set;

public class DoorServiceImpl implements DoorService {

    private DoorServiceImpl service = null;
    private DoorRepository repository;

    private DoorServiceImpl(){
        this.repository = DoorRepositoryImpl.getRepository();
    }

    public DoorService getService(){
        if (service == null) service = new DoorServiceImpl();
        return service;
    }

    @Override
    public Door create(Door door) {
        return this.repository.create(door);
    }

    @Override
    public Door update(Door door) {
        return this.repository.update(door);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Door read(String s) {
        return this.repository.read(s);
    }

}