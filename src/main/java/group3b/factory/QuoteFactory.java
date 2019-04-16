package group3b.factory;

import group3b.domain.Quote;
import group3b.util.Misc;

public class QuoteFactory {
    public static Quote getQuote(String Name) {
        return new Quote.Builder().quoteId(Misc.generateId())
                .name(Name)
                .build();
    }

}
