public class Bus extends Car {
    private int passengers;
    private int capacity;

    public Bus(String typeName, int capacity) {
        super(typeName);
        this.capacity = capacity;
        this.passengers = 0;
    }

    public Bus(String typeName, int speed, double gasolineLevel, int capacity) {
        super(typeName, speed, gasolineLevel);
        this.capacity = capacity;
        this.passengers = 0;
    }

    public void passengerEnter(int count) {
        if (passengers + count <= capacity)
            passengers += count;
        else
            System.out.println("Bus is full! Only " + (capacity - passengers) + " seats left.");
    }

    public void passengerExit(int count) {
        if (count <= passengers)
            passengers -= count;
        else
            passengers = 0;
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            double newSpeed = getSpeed() + 5;
            double newFuel = getGasolineLevel() - (1 + passengers * 0.05);
            if (newFuel < 0) newFuel = 0;

            updateState(newSpeed, newFuel);
        } else {
            updateState(0, 0);
        }
    }

    public int getPassengers() {
        return passengers;
    }

    public int getCapacity() {
        return capacity;
    }

    private void updateState(double speed, double fuel) {
        try {
            java.lang.reflect.Field speedField = Car.class.getDeclaredField("speed");
            java.lang.reflect.Field fuelField = Car.class.getDeclaredField("gasolineLevel");
            speedField.setAccessible(true);
            fuelField.setAccessible(true);
            speedField.set(this, speed);
            fuelField.set(this, fuel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
