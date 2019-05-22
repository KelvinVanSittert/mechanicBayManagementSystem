package group3b.service;
import group3b.domain.Cleaner;

import java.util.Set;

public interface CleanerService extends IService<Cleaner, String>{

    Set<Cleaner> getAll();

}
