package group3b.service;
import group3b.domain.Secretary;

import java.util.Set;

public interface SecretaryService extends IService<Secretary, String>{
    Set<Secretary> getAll();
}
