public abstract class AbstractVehicle implements Vehicle {
    protected String type;
    protected String fuel;
    protected double fuelEfficiency; // e.g., mpg

    public AbstractVehicle(String type, String fuel, double fuelEfficiency) {
        this.type = type;
        this.fuel = fuel;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void start() {
        System.out.println(type + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(type + " is stopping...");
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public abstract String getInfo();
}

/*
public class Car extends AbstractVehicle {
    private String color;

    public Car() {
        super("Car", "Petrol", 15.0);
        this.color = "Red";
    }

    @Override
    public String getInfo() {
        return "Car Information:\nType: " + type + "\nFuel: " + fuel + "\nColor: " + color;
    }
}*/

/*

public class Motorcycle extends AbstractVehicle {
    private String color;

    public Motorcycle() {
        super("Motorcycle", "Gasoline", 40.0);
        this.color = "Black";
    }

    @Override
    public String getInfo() {
        return "Motorcycle Information:\nType: " + type + "\nFuel: " + fuel + "\nColor: " + color;
    }
}
*/
/*public interface ElectricVehicle {
    void charge();
}
*/

/* AbstractVehicle.java (Updated)


/*
public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected String type;
    protected String fuel;
    protected double fuelEfficiency;

    public AbstractVehicle(String type, String fuel, double fuelEfficiency) {
        this.type = type;
        this.fuel = fuel;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void start() {
        System.out.println(type + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(type + " is stopping...");
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public void charge() {
        System.out.println(type + ": Not possible to charge (not electric).");
    }

    @Override
    public abstract String getInfo();
}
*/

/* VehicleDemo.java
public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration\n");

        AbstractVehicle[] vehicles = {
                new Car(),
                new Motorcycle(),
                new Bus(),
                new ElectricCar(),
                new ElectricMotorcycle()
        };

        for (AbstractVehicle v : vehicles) {
            v.start();
            v.stop();
            System.out.println(v.getInfo());
            v.charge();
            System.out.println("Fuel Efficiency: " + v.calculateFuelEfficiency() + "\n");
        }
    }
}

 */
