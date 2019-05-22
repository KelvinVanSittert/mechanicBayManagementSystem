package group3b.service.impl;

import group3b.domain.Window;
import group3b.repository.WindowRepository;
import group3b.repository.impl.WindowRepositoryImpl;
import group3b.service.WindowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class WindowServiceImpl implements WindowService {

    @Autowired
    @Qualifier("WindowRepo")
    private static WindowServiceImpl service = null;
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

    @Override
    public Set<Window> getAll() {
        return repository.getAll();
    }

}