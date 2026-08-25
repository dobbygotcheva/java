public class Car extends Vehicle {
    private int numSeats;

    public Car(String make, String model, int year, String fuelType, double fuelEfficiency, int numSeats) {
        super(make, model, year, fuelType, fuelEfficiency);
        this.numSeats = numSeats;
    }
    public int getNumSeats() {
        return numSeats;
    }
    @Override
    public double calculateFuelEfficiency() {
        // implementation for fuel efficiency calculation for cars
        return getFuelEfficiency() * (1.0 / (1.0 + (getNumSeats() / 5.0)));
    }
    @Override
    public double calculateDistanceTraveled() {
        // implementation for distance traveled calculation for cars
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    @Override
    public double getMaxSpeed() {
        // implementation for maximum speed calculation for cars
        return 120.0;
    }
}