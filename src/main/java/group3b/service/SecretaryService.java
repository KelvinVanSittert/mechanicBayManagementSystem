package group3b.service;
import group3b.domain.Secretary;

public interface SecretaryService extends IService<Secretary, String>{
    Secretary create(Secretary secretary);
}
