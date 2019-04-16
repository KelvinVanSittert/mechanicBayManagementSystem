package group3b.factory;

import group3b.domain.Customer;
import group3b.util.Misc;

public class CustomerFactory {
    public static Customer getCustomer(String Name) {
        return new Customer.Builder().customerId(Misc.generateId())
                .name(Name)
                .build();
    }

}
