package group3b.repository;

import group3b.domain.Quote;

import java.util.Set;


public interface QuoteRepository extends IRepository<Quote, String>{

    Set<Quote> getAll();

}