public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration\n");

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle bus = new Bus();

        Vehicle[] vehicles = {car, motorcycle, bus};

        for (Vehicle v : vehicles) {
            v.start();
            v.stop();
            System.out.println(v.getInfo());
            System.out.println("Fuel Efficiency: " + v.calculateFuelEfficiency() + " mpg\n");
        }
    }
}
