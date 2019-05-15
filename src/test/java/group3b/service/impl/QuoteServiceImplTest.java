package group3b.service.impl;

import group3b.domain.Quote;
import group3b.factory.QuoteFactory;
import group3b.repository.QuoteRepository;
import group3b.repository.impl.QuoteRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class QuoteServiceImplTest {
    private QuoteRepository repository;
    private Quote quote;

    private Quote getSavedQuote(){
        Set<Quote> savedQuotes = this.repository.getAll();
        return savedQuotes.iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.repository = QuoteRepositoryImpl.getRepository();
        this.quote = QuoteFactory.getQuote("Test Quote");
    }

    @Test
    public void create() {

        Quote testCreate = this.repository.create(this.quote);
        Assert.assertSame(testCreate, this.quote);

    }

    @Test
    public void delete() {

        int startingSize = this.repository.getAll().size();
        Quote savedQuote = getSavedQuote();
        this.repository.delete(savedQuote.getQuoteId());

        Assert.assertEquals(startingSize-1,this.repository.getAll().size());

        //Create another quote after deleting so that Read() has something to read.
        this.repository.create(this.quote);

    }

    @Test
    public void read() {

        Quote savedQuote = getSavedQuote();
        String id = savedQuote.getQuoteId();
        Quote readQuote = this.repository.read(id);
        Assert.assertEquals(savedQuote, readQuote);
    }

    @Test
    public void update() {

        Quote saved = getSavedQuote();
        String id = saved.getQuoteId();
        String newName = "Hello";
        saved.setName(newName);
        this.repository.update(saved);

        Assert.assertEquals(newName,this.repository.read(id).getName());

    }

    @Test
    public void getAll() {

        Set<Quote> all = this.repository.getAll();
        Assert.assertNotNull(all);

    }
}