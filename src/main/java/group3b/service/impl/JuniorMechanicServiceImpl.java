package group3b.service.impl;

import group3b.domain.JuniorMechanic;
import group3b.repository.JuniorMechanicRepository;
import group3b.repository.impl.JuniorMechanicRepositoryImpl;
import group3b.service.JuniorMechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class JuniorMechanicServiceImpl implements JuniorMechanicService {

    @Autowired
    @Qualifier("JuniorMechanicRepo")
    private static JuniorMechanicServiceImpl service = null;
    private JuniorMechanicRepository repository;

    private JuniorMechanicServiceImpl(){
        this.repository = JuniorMechanicRepositoryImpl.getRepository();
    }

    public static JuniorMechanicService getService(){
        if (service == null) service = new JuniorMechanicServiceImpl();
        return service;
    }

    @Override
    public JuniorMechanic create(JuniorMechanic juniorMechanic) {
        return this.repository.create(juniorMechanic);
    }

    @Override
    public JuniorMechanic update(JuniorMechanic juniorMechanic) {
        return this.repository.update(juniorMechanic);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public JuniorMechanic read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<JuniorMechanic> getAll() {
        return repository.getAll();
    }

}