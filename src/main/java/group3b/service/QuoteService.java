package group3b.service;
import group3b.domain.Quote;

import java.util.Set;

public interface QuoteService extends IService<Quote, String>{
    Set<Quote> getAll();
}
