package group3b.factory;

import group3b.domain.LoyalCustomer;
import group3b.util.Misc;

public class LoyalCustomerFactory {
    public static LoyalCustomer getLoyalCustomer(String Name) {
        return new LoyalCustomer.Builder().loyalCustomerId(Misc.generateId())
                .name(Name)
                .build();
    }

}