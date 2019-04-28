package group3b.service;

import group3b.domain.Bay;

public interface BayService extends IService<Bay, String>{

    Bay create(Bay bay);

}
