public class Bus implements Vehicle {
    private String fuel = "Diesel";
    private int capacity = 40;

    @Override
    public void start() {
        System.out.println("Bus is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping...");
    }

    @Override
    public String getInfo() {
        return "Bus Information:\nType: Bus\nFuel: " + fuel + "\nCapacity: " + capacity + " passengers";
    }

    @Override
    public double calculateFuelEfficiency() {
        return 8.0;
    }
}
