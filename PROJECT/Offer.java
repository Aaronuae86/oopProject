package PROJECT;


public class Offer {
    private String carType;
    private String location;
    private double farePerMeter;
    private int numberOfSeats;
    private String mobileNumber;  // Mobile number field
    private String username;

    // Constructor
    public Offer(String carType, String location, double farePerMeter, int numberOfSeats, String mobileNumber, String username) {
        this.carType = carType;
        this.location = location;
        this.farePerMeter = farePerMeter;
        this.numberOfSeats = numberOfSeats;
        this.mobileNumber = mobileNumber;
        this.username = username;
    }

    // Getter for mobile number
    public String getMobileNumber() {
        return mobileNumber;
    }

    // Other getters
    public String getCarType() {
        return carType;
    }

    public String getLocation() {
        return location;
    }

    public double getFarePerMeter() {
        return farePerMeter;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getUsername() {
        return username;
    }
}
