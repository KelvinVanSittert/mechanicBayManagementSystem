package group3b.service;
import group3b.domain.Cleaner;

public interface CleanerService extends IService<Cleaner, String>{

    Cleaner create(Cleaner cleaner);

}
