package group3b.factory;
import org.junit.Assert;
import org.junit.Test;
import group3b.domain.Quote;

import static org.junit.Assert.*;

public class QuoteFactoryTest {

    @Test
    public void getQuote() {

        String name = "ADP 3";
        Quote quote = QuoteFactory.getQuote(name);
        System.out.println(quote);
        Assert.assertNotNull(quote.getQuoteId());

    }
}