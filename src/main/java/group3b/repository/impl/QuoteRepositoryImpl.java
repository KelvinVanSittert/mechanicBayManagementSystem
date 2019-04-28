package group3b.repository.impl;

import group3b.domain.Quote;
import group3b.repository.QuoteRepository;

import java.util.HashSet;
import java.util.Set;

public class QuoteRepositoryImpl implements QuoteRepository {

    private static QuoteRepositoryImpl repository = null;
    private Set<Quote> quotes;

    private QuoteRepositoryImpl(){
        this.quotes = new HashSet<>();
    }

    public static QuoteRepositoryImpl getRepository(){
        if (repository == null) repository = new QuoteRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Quote> getAll() {
        return this.quotes;
    }

    @Override
    public Quote create(Quote quote) {
        this.quotes.add(quote);
        return quote;
    }

    @Override
    public Quote update(Quote quote) {

        return quote;
    }

    @Override
    public void delete(String quoteId) {
        Quote[] cloneOfQuotes = quotes.toArray(new Quote[quotes.size()]);
        for (int i = 0; i<cloneOfQuotes.length;i++) {
            if (cloneOfQuotes[i].getQuoteId() == quoteId) {
                cloneOfQuotes[i] = null;
            }
        }
        quotes.clear();

        for (int j = 0; j<cloneOfQuotes.length;j++){
            quotes.add(cloneOfQuotes[j]);
        }

    }

    @Override
    public Quote read(String quoteId) {

        Quote quoteToReturn = null;

        Quote[] cloneOfQuotes = quotes.toArray(new Quote[quotes.size()]);

        for (int i = 0; i<cloneOfQuotes.length;i++) {
            if (cloneOfQuotes[i].getQuoteId() == quoteId) {
                quoteToReturn = cloneOfQuotes[i];
            }
        }

        return quoteToReturn;
    }
}