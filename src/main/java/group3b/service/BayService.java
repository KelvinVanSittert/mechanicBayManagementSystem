package group3b.service;

import group3b.domain.Bay;
import group3b.service.IService;

import java.util.Set;


public interface BayService extends IService<Bay, String>{

    Set<Bay> getAll();

}
