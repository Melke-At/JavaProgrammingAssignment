public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Family Car");
        myCar.fillTank();
        System.out.println("Created: " + myCar.getTypeName());

        myCar.accelerate();
        System.out.println("Normal car speed: " + myCar.getSpeed());
        System.out.println("Normal car fuel: " + myCar.getGasolineLevel());

        SportsCar mySportsCar = new SportsCar("Ferrari");
        mySportsCar.fillTank();
        System.out.println("\nCreated: " + mySportsCar.getTypeName());

        mySportsCar.accelerate();
        System.out.println("Sports car speed after accelerate: " + mySportsCar.getSpeed());
        System.out.println("Sports car fuel after accelerate: " + mySportsCar.getGasolineLevel());

        mySportsCar.decelerate(5);
        System.out.println("Sports car speed after decelerate: " + mySportsCar.getSpeed());
        System.out.println("Sports car fuel after decelerate: " + mySportsCar.getGasolineLevel());
    }
}
