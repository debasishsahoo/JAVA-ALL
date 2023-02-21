public class AutoMobile {

    // Properties
    private String engine;
    private int wheels;
    private int seats;
    private int fuelTank;
    private String lights;

    // Default Constructor
    public AutoMobile() {
        this.engine = "petrol";
        this.wheels = 4;
        this.seats = 4;
        this.fuelTank = 35;
        this.lights = "LED";

    }

    // Parameterized Constructor
    public AutoMobile(String engine, int wheels, int seats, int fuelTank, String lights) {

        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.fuelTank = fuelTank;
        this.lights = lights;
    }

    // Methods
    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public String getLights() {
        return lights;
    }

    public void run() {
        System.out.println("Auto mobile Running..");
    }
}
