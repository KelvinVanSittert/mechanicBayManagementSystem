package group3b.domain;

public class Quote {

    private String name;
    private String quoteId;
    private String surname;

    private Quote(){}


    private Quote(Builder builder) {
        this.name = builder.name;
        this.quoteId = builder.quoteId;
        this.surname = builder.surname;
    }

    public String getName() {
        return name;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public String getSurname() {
        return surname;
    }


    public static class Builder{

        private String name, quoteId, surname;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder quoteId(String quoteId) {
            this.quoteId = quoteId;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Quote build() {
            return new Quote(this);
        }

    }

    @Override
    public String toString() {
        return " quote Name : " + name + "\n quote ID : " + quoteId + "\n Surname : " + surname;
    }
}
