package group3b.repository.impl;

import group3b.domain.Part;
import group3b.repository.PartRepository;

import java.util.HashSet;
import java.util.Set;

public class PartRepositoryImpl implements PartRepository {

    private static PartRepositoryImpl repository = null;
    private Set<Part> parts;

    private PartRepositoryImpl(){
        this.parts = new HashSet<>();
    }

    public static PartRepositoryImpl getRepository(){
        if (repository == null) repository = new PartRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Part> getAll() {
        return this.parts;
    }

    @Override
    public Part create(Part part) {
        this.parts.add(part);
        return part;
    }

    @Override
    public Part update(Part part) {

        return part;
    }

    @Override
    public void delete(String partId) {
        Part[] cloneOfParts = parts.toArray(new Part[parts.size()]);
        for (int i = 0; i<cloneOfParts.length;i++) {
            if (cloneOfParts[i].getPartId() == partId) {
                cloneOfParts[i] = null;
            }
        }
        parts.clear();

        for (int j = 0; j<cloneOfParts.length;j++){
            parts.add(cloneOfParts[j]);
        }

    }

    @Override
    public Part read(String partId) {

        Part partToReturn = null;

        Part[] cloneOfParts = parts.toArray(new Part[parts.size()]);

        for (int i = 0; i<cloneOfParts.length;i++) {
            if (cloneOfParts[i].getPartId() == partId) {
                partToReturn = cloneOfParts[i];
            }
        }

        return partToReturn;
    }
}