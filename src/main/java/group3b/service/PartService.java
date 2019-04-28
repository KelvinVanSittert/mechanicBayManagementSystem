package group3b.service;
import group3b.domain.Part;

public interface PartService extends IService<Part, String>{
    Part create(Part part);
}
