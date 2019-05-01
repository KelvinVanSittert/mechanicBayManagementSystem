package group3b.repository.impl;

import group3b.domain.Secretary;
import group3b.repository.SecretaryRepository;

import java.util.HashSet;
import java.util.Set;

public class SecretaryRepositoryImpl implements SecretaryRepository {

    private static SecretaryRepositoryImpl repository = null;
    private Set<Secretary> secretarys;

    private SecretaryRepositoryImpl(){
        this.secretarys = new HashSet<>();
    }

    public static SecretaryRepositoryImpl getRepository(){
        if (repository == null) repository = new SecretaryRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Secretary> getAll() {
        return this.secretarys;
    }

    @Override
    public Secretary create(Secretary secretary) {
        this.secretarys.add(secretary);
        return secretary;
    }

    @Override
    public Secretary update(Secretary secretary) {

        Secretary[] cloneOfSecretarys = secretarys.toArray(new Secretary[secretarys.size()]);
        for (int i = 0; i<cloneOfSecretarys.length;i++) {
            if (cloneOfSecretarys[i].equals(secretary)) {
                secretarys.remove(cloneOfSecretarys[i]);
            }
        }
        return create(secretary);
    }

    @Override
    public void delete(String secretaryId) {
        Secretary[] cloneOfSecretarys = secretarys.toArray(new Secretary[secretarys.size()]);
        for (int i = 0; i<cloneOfSecretarys.length;i++) {
            if (cloneOfSecretarys[i].getSecretaryId() == secretaryId) {
                if (secretarys.contains(cloneOfSecretarys[i])){
                    secretarys.remove(cloneOfSecretarys[i]);
                }
            }
        }
    }

    @Override
    public Secretary read(String secretaryId) {

        Secretary secretaryToReturn = null;

        Secretary[] cloneOfSecretarys = secretarys.toArray(new Secretary[secretarys.size()]);

        for (int i = 0; i<cloneOfSecretarys.length;i++) {
            if (cloneOfSecretarys[i].getSecretaryId() == secretaryId) {
                secretaryToReturn = cloneOfSecretarys[i];
            }
        }

        return secretaryToReturn;
    }
}