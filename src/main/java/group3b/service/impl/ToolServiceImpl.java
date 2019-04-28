package group3b.service.impl;

import group3b.domain.Tool;
import group3b.repository.ToolRepository;
import group3b.repository.impl.ToolRepositoryImpl;
import group3b.service.ToolService;

import java.util.Set;

public class ToolServiceImpl implements ToolService {

    private ToolServiceImpl service = null;
    private ToolRepository repository;

    private ToolServiceImpl(){
        this.repository = ToolRepositoryImpl.getRepository();
    }

    public ToolService getService(){
        if (service == null) service = new ToolServiceImpl();
        return service;
    }

    @Override
    public Tool create(Tool tool) {
        return this.repository.create(tool);
    }

    @Override
    public Tool update(Tool tool) {
        return this.repository.update(tool);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Tool read(String s) {
        return this.repository.read(s);
    }

}