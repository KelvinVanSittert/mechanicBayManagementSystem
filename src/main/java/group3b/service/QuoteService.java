package group3b.service;
import group3b.domain.Quote;

public interface QuoteService extends IService<Quote, String>{
    Quote create(Quote quote);
}
