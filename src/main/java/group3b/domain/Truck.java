package group3b.domain;

public class Truck {

    private String name;
    private String truckId;
    private String surname;

    private Truck(){}


    private Truck(Builder builder) {
        this.name = builder.name;
        this.truckId = builder.truckId;
        this.surname = builder.surname;
    }

    public String getName() {
        return name;
    }

    public String getTruckId() {
        return truckId;
    }

    public String getSurname() {
        return surname;
    }


    public static class Builder{

        private String name, truckId, surname;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder truckId(String truckId) {
            this.truckId = truckId;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Truck build() {
            return new Truck(this);
        }

    }

    @Override
    public String toString() {
        return " truck Name : " + name + "\n truck ID : " + truckId + "\n Surname : " + surname;
    }
}