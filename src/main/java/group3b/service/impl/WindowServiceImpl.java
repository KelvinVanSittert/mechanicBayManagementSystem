package group3b.service.impl;

import group3b.domain.Window;
import group3b.repository.WindowRepository;
import group3b.repository.impl.WindowRepositoryImpl;
import group3b.service.WindowService;

import java.util.Set;

public class WindowServiceImpl implements WindowService {

    private WindowServiceImpl service = null;
    private WindowRepository repository;

    private WindowServiceImpl(){
        this.repository = WindowRepositoryImpl.getRepository();
    }

    public WindowService getService(){
        if (service == null) service = new WindowServiceImpl();
        return service;
    }

    @Override
    public Window create(Window window) {
        return this.repository.create(window);
    }

    @Override
    public Window update(Window window) {
        return this.repository.update(window);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Window read(String s) {
        return this.repository.read(s);
    }

}