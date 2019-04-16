package group3b.domain;

public class ParkingBay {

    private String parkingName;
    private String parkingId;
    private boolean full;

    private ParkingBay(){}

    private ParkingBay(Builder builder) {
        this.parkingName = builder.parkingName;
        this.parkingId = builder.parkingId;
        this.full = builder.full;
    }

    public String getParkingName() {
        return parkingName;
    }

    public boolean getFull() {
        return full;
    }

    public String getParkingId() {
        return parkingId;
    }

    public static class Builder{

        private String parkingName, parkingId;
        private boolean full;

        public Builder parkingName(String parkingName) {
            this.parkingName = parkingName;
            return this;
        }

        public Builder full(boolean full) {
            this.full = full;
            return this;
        }

        public Builder parkingId(String parkingId) {
            this.parkingId = parkingId;
            return this;
        }

        public ParkingBay build() {
            return new ParkingBay(this);
        }

    }

    @Override
    public String toString() {
        return " Parking Name : " + parkingName + "\n Parking ID : " + parkingId + "\n Is full? : " + full;
    }
}