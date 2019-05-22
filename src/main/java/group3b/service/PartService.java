package group3b.service;
import group3b.domain.Part;

import java.util.Set;

public interface PartService extends IService<Part, String>{
    Set<Part> getAll();
}
